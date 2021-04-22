package week5;

public class AsteriskLogger implements Logger {

	@Override
	//Prints the String it receives between 3 asterisks on either side of the String 
	//(e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console.
	public void Log(String logInfo) {
		System.out.println("\n***" + logInfo + "***");
		
	}

	@Override
	//Prints the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. 
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
