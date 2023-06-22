package coreJava6;

class Mac extends Laptops {
    String macOSVersion;

    public Mac(int id, String name, double price, int warranty, String processors, double weight, String macOSVersion) {
        super(id, name, price, warranty, processors, weight);
        this.macOSVersion = macOSVersion;
    }

    @Override
    void printDetails() {
        System.out.printf("%d. Name:%s \t MacOS version:%s Price %f\nProcessors:%s\t weight %f\tLength of Warranty:%d\n",
                id, name, macOSVersion, price, processors, weight, warranty);
    }
}
