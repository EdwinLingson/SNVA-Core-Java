package coreJava2;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Month 1.Jan\n2.Feb\nMar\n...\n12Dec.");
		int month = scanner.nextInt();
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2: season = "Winter"; break;
		case 3: 
		case 4:
		case 5:season = "Spring"; break;
		case 6:
		case 7:
		case 8: season = "Summer"; break;
		case 9:
		case 10:
		case 11:season = "Fall"; break;
		default: season ="Invalid Month";
		}
		
		System.out.println("Season is :"+season);

	}

}
