package coreJava9.p2;

import coreJava9.p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("Protection2 Class Constructor");
//        System.out.println("num1 = "+num1);
//        System.out.println("num_private = "+num_private);
        System.out.println("num_protected = "+num_protected);
        System.out.println("num_public = "+num_public);
    }
}
