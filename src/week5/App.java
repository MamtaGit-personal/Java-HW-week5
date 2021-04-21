package week5;

import java.util.Scanner;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger logger = new SpacedLogger();
		
		//String userInput;
		//System.out.print("Please enter a word for the asterisk class: ");
		//userInput = scanner.next();
		//asterisk.Log(userInput);
		//asterisk.Error(userInput);
		
		asterisk.Log("asteriskHello");
		asterisk.Error("asteriskError");
				
		logger.Log("SpacedHello");
		logger.Error("SpacedError");
		
	}

}
