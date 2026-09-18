package five.min.markets.pool;

import five.min.markets.probability.BernoulliBayesModel;
import five.min.markets.probability.ProbabilityTableKey;
import net.openhft.chronicle.core.scoped.ScopedResourcePool;
import net.openhft.chronicle.core.scoped.ScopedThreadLocal;

import static java.lang.ThreadLocal.withInitial;

public final class ScopedProbabilityTableKeyPool {

	private static int instances = 1;
	private final ThreadLocal<ProbabilityTableKey> sbtl = withInitial(() -> new ProbabilityTableKey());

	public static ScopedResourcePool<ProbabilityTableKey> createThreadLocal() {
		return createThreadLocal(instances);
	}

	public static ScopedResourcePool<ProbabilityTableKey> createThreadLocal(int instancesPerThread) {
		return new ScopedThreadLocal<>(() -> new ProbabilityTableKey(), m -> m.reset(), instancesPerThread);
	}
}
