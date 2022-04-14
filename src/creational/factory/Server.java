package creational.factory;

public class Server extends Computer{

	private String ram;
	private String cpu;
	
	public Server (String ram,String cpu) {
		this.ram=ram;
		this.cpu=cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
	
}
