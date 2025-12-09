package Day6;

public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	public Program() {
		
	}
	
	public Program(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();
   

	// Getter
	public String getName() {
		return name;
	}
	
	public boolean getIsRunning() {
		return isRunning;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	
	
}
