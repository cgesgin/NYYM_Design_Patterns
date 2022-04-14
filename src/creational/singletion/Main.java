package creational.singletion;

public class Main {

	public static void main(String[] args){
	   	   
	   Singleton a = Singleton.getTreadSafeSingleton();
	   Singleton b = Singleton.getTreadSafeSingleton();
	   Singleton c = Singleton.getTreadSafeSingleton();
	  
	   System.out.println("a nesnesi : "+a.hashCode());
	   System.out.println("b nesnesi : "+b.hashCode());
	    
	   if(a==b) {
		   System.out.println("Ayný nesne");
	   }
	   
	}
}
