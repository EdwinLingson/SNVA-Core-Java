package coreJava6;

class X3 extends BMW {
    static int monthlyCount = 20;
    static int dailyCount = 0;
    static final int topSpeed = 100;
    static double price = 12345.96;

    static void sold() {
        monthlyCount++;
        dailyCount++;
        System.out.println("A X3 with the Registration Number: X100" + (monthlyCount - 1) + (dailyCount - 1) + " is Sold!!!");
    }

    public X3(String color) {
        super(color);
        System.out.println("A X3 has been created with " + color + " and bought\n Registration Number: X500" + monthlyCount + dailyCount);
    }
}
