package coreJava3;

public class BoxingExample {
    public static void main(String[] args) {
        long long1 = 21334314;
        double db1 = 2134122.4535;


        //Autoboxing
        Long longWrap = long1;
        Double doubleWrap = db1;

        System.out.println(longWrap+" "+doubleWrap);

        //Auto Unboxing

        long long2 = longWrap;
        double db2 = doubleWrap;

        System.out.println(long2+" "+db2);
    }
}
