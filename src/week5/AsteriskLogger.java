package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String logInfo) {
		System.out.println("\n***" + logInfo + "***");
		
	}

	@Override
	public void Error(String errorInfo) {
		String str = "***Error: " + errorInfo + "***";
		System.out.println("\n");
		for(int i = 0; i < str.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n***Error: "+ errorInfo + "***");
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print("*");
		}
		
	}

}
