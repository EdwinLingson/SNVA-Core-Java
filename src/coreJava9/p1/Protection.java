package coreJava9.p1;

public class Protection {
    int num1 =100;
    private int num_private=200;
    protected  int num_protected=300;
    public int num_public;
    public Protection(){
        System.out.println("Base Class Constructor");
        System.out.println("num1 = "+num1);
        System.out.println("num_private = "+num_private);
        System.out.println("num_protected = "+num_protected);
        System.out.println("num_public = "+num_public);
    }


}
