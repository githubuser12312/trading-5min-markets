package five.min.markets.pool;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ObjectPool<T> {

	private ConcurrentLinkedQueue<T> pool;
	private Class<T> type;
	
	public ObjectPool(Class<T> type, int poolSize) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		this.pool = new ConcurrentLinkedQueue<>();
		this.type = type;
		for(int i = 0; i < poolSize; i++) {
			this.pool.add(type.getDeclaredConstructor().newInstance());
		}
	}
	
	public T borrow() {
		return pool.remove();
	}
	
	public void give(T instance) {
		pool.offer(instance);
	}
	
	public Class<T> forType() {
		return type;
	}
}
