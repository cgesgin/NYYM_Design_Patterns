package structural.proxy;

public  class RealInternet implements Internet{

	@Override
	public void connectTo(String serverhost) {		
		System.out.println(serverhost+" Ba�lan�yor");
	}

}
