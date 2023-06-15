package coreJava3;

import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("Enter your month of birth");
		System.out.println(monthNames[scanner.nextInt()-1]);
		
	}
}
