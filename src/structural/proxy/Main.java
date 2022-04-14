package structural.proxy;

public class Main {
	 public static void main (String[] args)
	    {
	        Internet internet = new Proxy();
	        internet.connectTo("hello.edu");
	        internet.connectTo("abc.com");
	    }
}
