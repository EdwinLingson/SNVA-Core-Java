package coreJava6;

import java.util.Scanner;

class GadgetShop {
    Gadgets[] inventory = new Gadgets[10];
    BillItems[] bill = new BillItems[10];
    Scanner scanner = new Scanner(System.in);
    int BillSno = 0;
    double giftCardAmt;

    GadgetShop() {
        inventory[0] = new Mac(1, "Macbook Pro 1", 2499.99, 3, "M1", 4.2, "Catalina");
        inventory[1] = new Mac(2, "Macbook Pro 4", 2699.99, 3, "M5", 4.3, "Big Sur");
        inventory[2] = new HP(3, "Pavilion W1", 1099.99, 2, "i5", 6.2, "Windows", 11.1);
        inventory[3] = new HP(4, "Notebook 5", 1799.99, 2, "i7", 7.1, "Windows", 10.2);
        inventory[4] = new LaptopAccessories(5, "External Mouse", 14.99, 1, true, "Wi-Fi Dongle");
        inventory[5] = new LaptopAccessories(6, "Keyboard", 29.99, 1, true, "Bluetooth");
        inventory[6] = new LaptopAccessories(7, "Webcam", 24.99, 1, false, "Wired USB");
        inventory[7] = new InterfaceAccessories(8, "Cooling pad", 49.99, 3, true, 1, 3);
        inventory[8] = new InterfaceAccessories(9, "HDMI Cable", 15.99, 1, true, 4, 1);
        inventory[9] = new InterfaceAccessories(10, "USB Cable and hub", 23.99, 2, true, 5, 6);
    }

    void printInventory() {
        for (Gadgets item : inventory) {
            item.printBasic();
        }
    }

    Gadgets getGadget(int i) {
        return inventory[i - 1];
    }

    void addToBill(Gadgets selectedGadget, int quantity) {
        bill[BillSno] = new BillItems(BillSno, selectedGadget.name, selectedGadget.price, quantity);
        BillSno++;
    }

    double calculateBillTotal() {
        double total = 0;
        for (int i = 0; i < BillSno; i++) {
            BillItems g = bill[i];
            total = total + (g.price * g.quantity);
        }
        return total;
    }

    void printLine() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
    }

    void printBill() {
        printLine();
        System.out.printf("S.No\tItem\t\tprice\t\tqty\tpayable\n");
        printLine();
        for (int i = 0; i < BillSno; i++) {
            BillItems b = bill[i];
            System.out.printf("%d\t%s  \t\t%f\t%d\t  %f\n", b.sNo + 1, b.name, b.price, b.quantity, b.price * b.quantity);

        }
        printLine();
        System.out.printf("Your Total is : \t\t\t\t\t %f\n", calculateBillTotal());
        printLine();
    }

    void giftcardSettings(double total) {
        if (giftCardAmt - total > 0) {
            System.out.printf("You have %f left in gift card?\n", giftCardAmt - total);
            System.out.println("Do you want to proceed?\n1.Yes\n2.No");
        } else if (giftCardAmt == total) {
            System.out.println("You have exhausted your gift card\n");
            System.out.println("Do you want to proceed?\n1.Yes\n2.No");
        } else {
            System.out.printf("You have to pay %f more than your giftcard value\n", (total - giftCardAmt));
            System.out.println("Do you still want to proceed?\n1.Yes\n2.No");
        }
    }

    void checkout() {
        printBill();
        double total = calculateBillTotal();
        if (total > giftCardAmt) {
            System.out.printf("You have to pay %f\n How do you want to pay\n1.Cash\n2.Credit Card\n", total - giftCardAmt);
            int cashCard = scanner.nextInt();
            switch (cashCard) {
                case 1:
                    System.out.println("You have completed the checkout by cash");
                    break;
                case 2:
                    System.out.println("You have selected payment using Credit Card\n Follow instruction on the Pin Pad");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        } else if (total == giftCardAmt) {
            System.out.println("You have paid completely using Gift Card");
        } else {
            System.out.printf("You have paid completely with gift card and you have %f balance in giftcard \n", giftCardAmt - total);
        }
        System.out.println("THANKS FOR THE VISIT SEE YOU SOON");
    }

    void chatbot() {
        System.out.println("Welcome to Windsor e-Mart\nHello What is your name?");
        String name = scanner.next();

        System.out.printf("Hey %s! How are you doing today\n", name);
        scanner.next();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give best accessories buying experience!!!\nBefore that do you have a gift card?\n1.Yes\n2.No\n", name, name);
        int haveGiftcard = scanner.nextInt();
        switch (haveGiftcard) {
            case 1:
                System.out.println("How much is there in Giftcard?\n");
                giftCardAmt = scanner.nextDouble();
                break;
            case 2:
                System.out.println("That is ok");
                break;
        }
        int stayinShop = 0;
        do {
            System.out.printf("So %s, What would you like to buy today?\n", name);
            printInventory();
            int selection = scanner.nextInt();
            getGadget(selection).printDetails();
            System.out.println("Do you want to buy this item?\n1.Yes\n2.No");
            int doBuy = scanner.nextInt();
            if (doBuy == 2) continue;
            System.out.printf("How much quantity that do you want ?\n");
            int q = scanner.nextInt();
            addToBill(getGadget(selection), q);
            printBill();
            giftcardSettings(calculateBillTotal());
            stayinShop = scanner.nextInt();
        } while (stayinShop != 2);
        checkout();
    }
}
