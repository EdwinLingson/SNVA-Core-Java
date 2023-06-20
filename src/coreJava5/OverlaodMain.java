package coreJava5;

public class OverlaodMain {
    public static void main(String[] args) {
        Overload overload = new Overload();
//        overload.sum();
//        overload.sum(100);
//        OverloadSub overloadSub =  new OverloadSub();
//        System.out.println(overloadSub.sum(100,300));
//        overloadSub.sum(300,500,800);
        overload.i=100;
        overload.j=200;
        System.out.println(overload.sum(overload.i, overload.j));

        OverloadSub overloadSub = new OverloadSub();
        System.out.println(overloadSub.sum(overload.i, overload.j));
    }
}
