package creational.factory;

public class Main {

	public static void main(String args[]) {
		ComputerFactory computerFactory = new ComputerFactory();
		PC myPc = (PC) computerFactory.getComputer("pc", "250gb", "2,5ghz");
		Server server = (Server) computerFactory.getComputer("server", "550gb", "2,5ghz");
		System.out.println("pc : " + myPc);
		System.out.println("server : " + server);
	}

}
