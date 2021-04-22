package week5;

public class SpacedLogger implements Logger {

	@Override
	//Prints the String it receives after adding spaces between each character of the String
	public void Log(String logInfo) {
		System.out.println("\n");
		for(int i=0; i < logInfo.length(); i++) {
			if(i < (logInfo.length() - 1)) {
				System.out.print(logInfo.charAt(i) + " ");
			}
			else {
				System.out.print(logInfo.charAt(i));
			}
		}// for loop
	}

	@Override
	//Prints the String it receives after adding spaces between each character of the String
	//but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o) 
	public void Error(String errorInfo) {
		System.out.print("\n\nERROR: ");
		for(int i=0; i < errorInfo.length(); i++) {
			if(i < (errorInfo.length() - 1)) {
				System.out.print(errorInfo.charAt(i) + " ");
			}
			else {
				System.out.print(errorInfo.charAt(i));
			}
		}// for loop
	}

}
