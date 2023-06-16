package coreJava3;

import java.util.Scanner;

class myClass{
    int a ,b,c;
}
public class ClassTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myClass abc = new myClass();
        System.out.println("Enter a");
        abc.a = scanner.nextInt();
        System.out.println("Enter b");
        abc.b = scanner.nextInt();
        System.out.println("Enter c");
        abc.c = scanner.nextInt();

        System.out.printf("Value of solved equation is: %d\n",3* abc.a+5*abc.b-2* abc.c );

    }
}

