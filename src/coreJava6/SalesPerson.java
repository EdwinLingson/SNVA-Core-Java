package coreJava6;

final class SalesPerson {
    final String name;
    int carsSold;
    int x1_sold, x5_sold, x3_sold;
    int x1_sold_daily, x5_sold_daily, x3_sold_daily;

    SalesPerson(String name) {
        this.name = name;
        this.carsSold = 0;
        x1_sold = x5_sold = x3_sold = 20;
        x1_sold_daily = x5_sold_daily = x3_sold_daily = 0;
    }
}
