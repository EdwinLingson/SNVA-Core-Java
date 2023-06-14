package coreJava2;

import java.util.Scanner;

public class SwitchTaskVowelIndentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Character to be tested");
		Scanner scanner = new Scanner(System.in);
		char inChar =scanner.nextLine().charAt(0);
		if(Character.isAlphabetic(inChar))
		switch(Character.toLowerCase(inChar)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println(inChar +" is a vowel"); break;
		default: System.out.println(inChar + " is a consonant");
		}
		else System.out.println(inChar + " is not an alphabet");
	}
	

}

/*
 * 
Enter Character to be tested
b
b is a consonant

Enter Character to be tested
A
A is a vowel

Enter Character to be tested
9
9 is not a alphabet

 */