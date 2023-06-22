package coreJava6;

class HP extends Laptops {
    String os;
    double version;

    public HP(int id, String name, double price, int warranty, String processors, double weight, String os, double version) {
        super(id, name, price, warranty, processors, weight);
        this.os = os;
        this.version = version;
    }

    @Override
    void printDetails() {
        System.out.printf("%d. Name:%s \t OS:%s %f Price %f\nProcessors:%s\t weight %f\tLength of Warranty:%d\n",
                id, name, os, version, price, processors, weight, warranty);
    }
}
