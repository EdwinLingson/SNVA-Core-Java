package coreJava9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Num 1: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter Num 2: ");
            int num2 = scanner.nextInt();
            int divide = num1/num2;
            System.out.println("The quotient is :"+divide);
            int nums[] ={100,200,300};
            nums[99] =400;
        }
//        catch (ArrayIndexOutOfBoundsException |InputMismatchException |ArithmeticException e) {
        catch (Exception e) {
            System.out.println("Exception caught: "+e);
        }

        System.out.println("After Try catch... You will now believe");
        int ctr =5;
        while (ctr>0){
            System.out.println(ctr--);
        }
    }
}
