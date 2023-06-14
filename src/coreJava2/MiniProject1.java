package coreJava2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		int menu1;
		float total;
		int count;
		double priceList[] = {3.99,4.49,4.99,7.98,8.98,9.98};
		String ItemsList[] = {"Orange (s)","Apple (s)", "Mango (s)","Orange (e)","Apple (e)", "Mango (e)"};
		List<Integer> itemsList = new ArrayList<Integer>();
		List<Integer> q_items = new ArrayList<Integer>();
		System.out.println("Hello What is your name?");
		name = scanner.nextLine();
		
		System.out.printf("Hey %s! How are you doing today\n",name);
		scanner.nextLine();
		
		do {
			
		System.out.println("What would you like today?\n1.Scoops\n2.Exquisite\n");
		menu1 = scanner.nextInt();

		switch(menu1) {
		case 1:
		{
			System.out.println("How many Scoops do you want?");
			count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				System.out.println("List of Scoops:\n1.Orange \t 3.99\n2.Apple \t 4.49\n3.Mango \t 4.99\n");
				System.out.printf("Enter icecream %d of %d\n",i+1,count);	
				itemsList.add(scanner.nextInt()-1);
				System.out.println("How many Scoops of this flavour do you need?");
				q_items.add(scanner.nextInt());
			}
			break;
		}
		case 2:
		{
			System.out.println("How many Exquisite do you want?");
			count = scanner.nextInt();
			System.out.println("List of Exquisite:\n1.Orange \t 7.98\n2.Apple \t 8.98\n3.Mango \t 9.98\n");
			for (int i = 0; i < count; i++) {
				System.out.printf("Enter icecream %d of %d\n",i+1,count);	
				itemsList.add(scanner.nextInt()+2);
				System.out.println("How many Exquisite of this flavour do you need?");
				q_items.add(scanner.nextInt());
			}
			
			break;
		}
		}
		for(int i=0;i<75;i++) {
			System.out.print("-");
		}
		System.out.println("-");
		total =0;
		System.out.printf("S.No\tMenu Item\t\tprice\t\tqty\tpayable\n");
		for (int i=0;i<itemsList.size();i++) {
			System.out.printf("%d\t%s  \t\t%f\t%d\t  %f\n",i+1,ItemsList[itemsList.get(i)],priceList[itemsList.get(i)],q_items.get(i),q_items.get(i)*priceList[itemsList.get(i)]);
			total+= q_items.get(i)*priceList[itemsList.get(i)];
		}
		for(int i=0;i<75;i++) {
			System.out.print("-");
		}
		System.out.println("-");
		System.out.printf("Your Total is : \t\t\t\t\t %f\n",total);
		for(int i=0;i<75;i++) {
			System.out.print("-");
		}
		System.out.println("-");
		
		System.out.println("Do you want More?Yes(1)/No(0)");
		menu1 = scanner.nextInt();
		}while(menu1==1);
		
		
		System.out.println("Thaks for the visit!!! See You again");
		
		
	}

}
