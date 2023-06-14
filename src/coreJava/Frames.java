package coreJava;
import java.util.Scanner;

public class Frames {
public static void main(String[] args) {
	int side1,side2,side3;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Side 1:");
	side1 = scanner.nextInt();
	System.out.println("Enter Side 2:");
	side2 = scanner.nextInt();
	;
	if(side1==side2) {	
		System.out.println("The Frame is Square");
	}
	
	else  {
		System.out.println("The Frame is a Rectangle");
	}
	
}
}
