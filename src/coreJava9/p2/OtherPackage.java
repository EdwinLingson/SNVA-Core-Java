package coreJava9.p2;

import coreJava9.p1.Protection;
import coreJava9.p1.SamePackage;

public class OtherPackage {
    OtherPackage(){
        System.out.println("Other package Class Constructor");
        Protection protection = new Protection();
//        System.out.println("num1 = "+protection.num1);
//        System.out.println("num_private = "+protection.num_private);
//        System.out.println("num_protected = "+protection.num_protected);
        System.out.println("num_public = "+protection.num_public);
    }

    public static void main(String[] args) {
        SamePackage samePackage = new SamePackage();
        OtherPackage otherPackage = new OtherPackage();

    }
}
