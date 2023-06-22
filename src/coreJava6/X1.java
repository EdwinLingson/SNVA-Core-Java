package coreJava6;

class X1 extends BMW {
    static int monthlyCount = 25;
    static int dailyCount = 0;
    static final int topSpeed = 100;
    static double price = 12345.96;

    public X1(String color) {
        super(color);
        System.out.println("A X1 has been created with " + color + " and bought\n Registration Number: X100" + monthlyCount + dailyCount);
    }

    static void sold() {
        monthlyCount++;
        dailyCount++;
        System.out.println("A X1 with the Registration Number: X100" + (monthlyCount - 1) + (dailyCount - 1) + " is Sold!!!");
    }
}
