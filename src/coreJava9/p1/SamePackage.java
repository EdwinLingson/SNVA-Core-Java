package coreJava9.p1;

public class SamePackage {
    public SamePackage()
    {
        Protection protection = new Protection();
        System.out.println("Same Package Class Constructor");
        System.out.println("num1 = "+protection.num1);
//        System.out.println("num_private = "+protection.num_private);
        System.out.println("num_protected = "+protection.num_protected);
        System.out.println("num_public = "+protection.num_public);
    }
}
