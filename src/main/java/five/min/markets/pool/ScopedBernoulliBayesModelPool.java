package five.min.markets.pool;

import five.min.markets.probability.BernoulliBayesModel;
import net.openhft.chronicle.core.scoped.ScopedResourcePool;
import net.openhft.chronicle.core.scoped.ScopedThreadLocal;

import static java.lang.ThreadLocal.withInitial;

public final class ScopedBernoulliBayesModelPool {

	private static int instances = 1;
	private final ThreadLocal<BernoulliBayesModel> sbtl = withInitial(() -> new BernoulliBayesModel(0));

	public static ScopedResourcePool<BernoulliBayesModel> createThreadLocal() {
		return createThreadLocal(instances);
	}

	public static ScopedResourcePool<BernoulliBayesModel> createThreadLocal(int instancesPerThread) {
		return new ScopedThreadLocal<>(() -> new BernoulliBayesModel(0), m -> m.reset(), instancesPerThread);
	}
}
