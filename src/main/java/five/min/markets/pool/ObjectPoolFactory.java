package five.min.markets.pool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class ObjectPoolFactory {

	private Map<Class<?>, ObjectPool<?>> typePoolMap = new HashMap<>();
	
	private ObjectPoolFactory(List<ObjectPool<?>> pools) {
		for(ObjectPool<?> pool : pools) {
			typePoolMap.put(pool.forType(), pool);
		}
	}
	
	public <T> T borrow(Class<T> type) {
		if(!typePoolMap.containsKey(type)) throw new RuntimeException("Unpooled type " + type.getCanonicalName());
		return (T) typePoolMap.get(type).borrow();
	}
	
	public <T> void give(T object) {
		if(!typePoolMap.containsKey(object.getClass())) throw new RuntimeException("Unpooled type " + object.getClass().getCanonicalName());
		((ObjectPool<T>)typePoolMap.get(object.getClass())).give(object);
	}
	
	
}
