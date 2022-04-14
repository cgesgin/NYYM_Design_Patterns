package creational.factory;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "[getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + "]";
	}

}
