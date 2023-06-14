package coreJava;

import java.util.Scanner;

public class Shapes {
public static void main(String[] args) {
	int side1,side2,side3;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Side 1:");
	side1 = scanner.nextInt();
	System.out.println("Enter Side 2:");
	side2 = scanner.nextInt();
	System.out.println("Enter Side 3:");
	side3 = scanner.nextInt();
	if(side1==side2&&side2==side3) {	
		System.out.println("The Triangle is Equilateral");
	}
	else if(side1==side2 || side2==side3 || side3==side1) {
		System.out.println("The Triangle is Isosceles");
	}
	else  {
		System.out.println("The Triangle is a Scalene");
	}
	
}
}
