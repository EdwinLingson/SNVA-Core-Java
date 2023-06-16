package coreJava3;

public class BoxingExample2 {
    public static void main(String[] args) {
        int i=1234;
        float f= 1234.56f;
        boolean b=false;

        Integer I = i;
        Float F= f;
        Boolean B= b;
        System.out.println("Int autoboxing: "+I);
        System.out.println("Float autoboxing: "+ F);
        System.out.println("Boolean autoboxing: "+ B);


        //Auto Unboxing

        int i2 = I;
        float f2 = F;
        boolean b2 = B;

        System.out.println("Int auto unboxing: "+i2);
        System.out.println("Float auto unboxing: "+ f2);
        System.out.println("Boolean auto unboxing: "+ b2);

    }
}
