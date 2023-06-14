package coreJava2;

import java.util.Scanner;

public class MidPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter first number\n");
//		int a = scanner.nextInt();
//		System.out.println("Enter Second Number\n");
//		int b = scanner.nextInt();
//		System.out.println("midpoint is "+ (a+(b-a)/2));
		System.out.println("please enter start number:");
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        int j = i;
        System.out.println("please enter end number:");
        int end = scanner.nextInt();
        
        if(i>end)
        {
            System.out.println("error: start number shoud less than end number");
        }
        else 
        {
            while(j<=end)
            {
                
                i++;
                j = j + 2;
                
                if(j>end)
                {
                    System.out.println((i-1) + " " + i);
                    break;
                }
                if(j==end)
                {
                    System.out.println(i);
                    break;
                }
            }
        }

	}

}
