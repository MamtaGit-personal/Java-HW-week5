package week5;

import java.util.Scanner;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("asteriskHello");
		asteriskLogger.Error("asteriskError");
				
		spacedLogger.Log("SpacedHello");
		spacedLogger.Error("SpacedError");
		
	}

}
