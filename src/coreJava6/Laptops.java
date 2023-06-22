package coreJava6;

abstract class Laptops extends Gadgets {
    String processors;
    double weight;

    public Laptops(int id, String name, double price, int warranty, String processors, double weight) {
        super(id, name, price, warranty);
        this.processors = processors;
        this.weight = weight;
    }
}
