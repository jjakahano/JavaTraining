package Day6;

public class MSWord extends Program{
	
	public MSWord(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		System.out.println("Opening MS Word...");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Word...");
	}
}
