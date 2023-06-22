package coreJava6;

class LaptopAccessories extends Gadgets {
    boolean isWireless;
    String connectionTechnology;

    public LaptopAccessories(int id, String name, double price, int warranty, boolean isWireless, String connectionTechnology) {
        super(id, name, price, warranty);
        this.isWireless = isWireless;
        this.connectionTechnology = connectionTechnology;
    }

    @Override
    void printDetails() {
        System.out.printf("%d. Name:%s \tPrice %f\n Wireless or Not:%s\tConnection Technology: %s\tLength of Warranty:%d\n",
                id, name, price, isWireless ? "Yes" : "No", connectionTechnology, warranty);
    }
}
