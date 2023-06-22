package coreJava6;

abstract class Gadgets {
    int id;
    String name;
    double price;
    int warranty;

    public Gadgets(int id, String name, double price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    void printBasic() {
        System.out.printf("%d. Name:%s \t Price %f\n",
                id, name, price);
    }

    abstract void printDetails();


}
