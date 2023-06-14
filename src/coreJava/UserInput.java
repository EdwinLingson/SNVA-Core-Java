package coreJava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		float height;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter name");
		name = scanner.nextLine();
		System.out.println("Enter Age");
		age = scanner.nextInt();
		System.out.println("Enter Height");
		height = scanner.nextFloat();
		System.out.printf("Name: %s \n Age: %d \n Height :%f \n",name, age, height);
	}

}
