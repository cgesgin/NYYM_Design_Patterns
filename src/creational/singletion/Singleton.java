package creational.singletion;

public class Singleton {

	private static Singleton singleton ;
	
	private Singleton(){
		System.out.println("Singleton yaratýldý...");
	}
	public static Singleton getTreadSafeSingleton(){
		if(singleton==null){
			synchronized (Singleton.class) {
	            if(singleton == null){
	            	singleton = new Singleton();
	            }
	        }
		}
		return singleton;
	}
}
