package coreJava2;

import java.util.Scanner;

public class TopicSelectionSwitchNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int topic, subTopic;
		System.out.println("Enter a Topic:\n1.JS\n2.Java\n3.RDBMS\n");
		topic = scanner.nextInt();
		switch(topic) {
		case 1:
		{
			System.out.println("Enter a Sub Topic:\n1.JS Variables \n2.ES6 \n3.Promises\n");
			subTopic = scanner.nextInt();
			switch(subTopic) {
			case 1: System.out.println("You have chosen JS as Topic and JS Variables as sub topic");break;
			case 2: System.out.println("You have chosen JS as Topic and ES6 as sub topic");break;
			case 3: System.out.println("You have chosen JS as Topic and Promises as sub topic");break;
			default: System.out.println("You have chosen a invalid sub topic");break;
			}
			break;
		}
		case 2: {
			System.out.println("Enter a Sub Topic:\n1.Core Java \n2.MultiThreading \n3.Swing\n");
			subTopic = scanner.nextInt();
			switch(subTopic) {
			case 1: System.out.println("You have chosen Java as Topic and Core Java as sub topic");break;
			case 2: System.out.println("You have chosen Java as Topic and Multithreading as sub topic");break;
			case 3: System.out.println("You have chosen Java as Topic and Swing as sub topic");break;
			default: System.out.println("You have chosen a invalid sub topic");break;
			}
			break;
		}
		case 3: {
			System.out.println("Enter a Sub Topic:\n1.SQL \n2.Oracle \n3.MySQL\n");
			subTopic = scanner.nextInt();
			switch(subTopic) {
			case 1: System.out.println("You have chosen RDBMS as Topic and SQL as sub topic");break;
			case 2: System.out.println("You have chosen RDBMS as Topic and Oracle as sub topic");break;
			case 3: System.out.println("You have chosen RDBMS as Topic and MySQL as sub topic");break;
			default: System.out.println("You have chosen a invalid sub topic");break;
			}
			break;
		}
		default: System.out.println("You have chosen a invalid topic");break;
		
	}

}
}

/*
Enter a Topic:
1.JS
2.Java
3.RDBMS

1
Enter a Sub Topic:
1.JS Variables 
2.ES6 
3.Promises

1
You have chosen JS as Topic and JS Variables as sub topic


Enter a Topic:
1.JS
2.Java
3.RDBMS

2
Enter a Sub Topic:
1.Core Java 
2.MultiThreading 
3.Swing

2
You have chosen Java as Topic and Multithreading as sub topic


Enter a Topic:
1.JS
2.Java
3.RDBMS

3
Enter a Sub Topic:
1.SQL 
2.Oracle 
3.MySQL

3
You have chosen RDBMS as Topic and MySQL as sub topic

 
 */

