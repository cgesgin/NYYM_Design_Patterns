package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ijk.com");
		bannedSites.add("lnm.com");
	}

	@Override
	public void connectTo(String serverhost) {
		if (bannedSites.contains(serverhost.toLowerCase())) {
			System.out.print(serverhost +" Eriþim baþarýsýz.");
		}
		else {internet.connectTo(serverhost);}
	}

}
