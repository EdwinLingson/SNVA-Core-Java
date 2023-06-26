package coreJava9.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Derived Class Constructor");
        System.out.println("num1 = "+num1);
//        System.out.println("num_private = "+num_private);
        System.out.println("num_protected = "+num_protected);
        System.out.println("num_public = "+num_public);
    }
}
