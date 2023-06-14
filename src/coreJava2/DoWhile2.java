package coreJava2;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userInput;
		
		do {
			System.out.println("Java is Easy to Learn");
			System.out.println("Do you want to print again?Y/N");	
			userInput = scanner.nextLine().charAt(0);
		}while(userInput=='Y');
	}
	
}
