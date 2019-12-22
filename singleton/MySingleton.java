package designpattern.singleton;

public class MySingleton {
	private static volatile MySingleton INSTANCE = null;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		if(null == INSTANCE) {
			synchronized(MySingleton.class) {
				if(null == INSTANCE) {
					INSTANCE = new MySingleton();
				}
			}
		}
		
		return INSTANCE; 
	}
}
