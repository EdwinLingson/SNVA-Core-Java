package coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalaBakery {
	
	public static void main(String[] args) {
		List<Integer> items =  new ArrayList<Integer>(4);
		String[] nameItems = {"Black Current","Caramel","White Forest","Chocolate","Red Velvet"};
		Scanner scanner = new Scanner(System.in);
		List<Integer> priceList = createPriceList();
		for(String name:nameItems){
			System.out.printf("Enter number of %s:\n",name);
			items.add(scanner.nextInt());
		}
		
		int price_calculated = calculate(items,priceList);
		
		printBreak();
		System.out.printf("Menu Item\t\tprice\tqty\tpayable\n");
		printBreak();
		for(int i =0;i<5;i++) {
			System.out.printf("%s  \t\t%d\t%d\t  %d\n",nameItems[i],priceList.get(i),items.get(i),priceList.get(i)*items.get(i));
		}
		printBreak();
		System.out.printf("Total: \t\t\t\t\t %d\n",price_calculated);
		printBreak();
		}
	static void printBreak() {
		for(int i=0;i<50;i++) {
			System.out.print("=");
		}
		System.out.println("=");
	}
	static List <Integer> createPriceList() {
			List<Integer> priceList = new ArrayList<Integer>(5);
			priceList.add(5);
			priceList.add(4);
			priceList.add(6);
			priceList.add(3);
			priceList.add(7);
			return priceList;
		}
		static int calculate(List<Integer> items,List<Integer> priceList) {
			int sum =0;
			for(int i =0;i<5;i++) {
				sum+= items.get(i)*priceList.get(i);
			}
			return sum;
		}
}
