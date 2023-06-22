package coreJava6;

class InterfaceAccessories extends Gadgets {
    boolean isCable;
    double length;
    int no_of_ports;

    public InterfaceAccessories(int id, String name, double price, int warranty, boolean isCable, double length, int no_of_ports) {
        super(id, name, price, warranty);
        this.isCable = isCable;
        this.length = length;
        this.no_of_ports = no_of_ports;
    }

    @Override
    void printDetails() {
        System.out.printf("%d. Name:%s \tPrice %f\n Comes with cable:%s\tlength(in feet): %f\tNo of Ports: %d \tLength of Warranty:%d\n",
                id, name, price, isCable ? "Yes" : "No", length, no_of_ports, warranty);
    }
}
