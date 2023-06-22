package coreJava6;

class X5 extends BMW {
    static int monthlyCount = 30;
    static int dailyCount = 0;
    static final int topSpeed = 100;
    static double price = 12345.96;

    public X5(String color) {
        super(color);
        System.out.println("A X5 has been created with " + color + " and bought\n Registration Number: X500" + monthlyCount + dailyCount);
    }

    static void sold() {
        monthlyCount++;
        dailyCount++;
        System.out.println("A X5 with the Registration Number: X100" + (monthlyCount - 1) + (dailyCount - 1) + " is Sold!!!");
    }
}
