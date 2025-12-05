package Day5;

public class MyApplication {

	public static void main(String[] args) {
		Executable excel = new MSExcel();
		Executable word = new MSWord();
		
		// running
		runProgram(excel);
		runProgram(word);
		
		// stopping
		stopProgram(excel);
		stopProgram(word);
	}
	
	private static void runProgram(Executable executableProgram) {
		executableProgram.run();
	}
	private static void stopProgram(Executable executableProgram) {
		executableProgram.stop();
	}


}
