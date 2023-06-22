package coreJava6;

import java.util.Scanner;

class CarDealer {
    Scanner scanner = new Scanner(System.in);
    SalesPerson george = new SalesPerson("George");
    SalesPerson patrick = new SalesPerson("Patrick");
    SalesPerson simpson = new SalesPerson("Simpson");

    void buyACar(SalesPerson salesPerson) {
        System.out.println("Which of the following car do you want to buy today?\n1.X1\n2.X3\n3.X5");
        int whichCar = scanner.nextInt();
        System.out.println("Which color do you want?\n1.Red\n2.Blue\n3.Green");
        int color = scanner.nextInt();
        switch (whichCar) {
            case 1:
                buyX1(color, salesPerson);
                X1.sold();
                break;
            case 2:
                buyX3(color, salesPerson);
                X3.sold();
                break;
            case 3:
                buyX5(color, salesPerson);
                X5.sold();
                break;
        }
    }

    private void buyX5(int color, SalesPerson salesPerson) {

        salesPerson.x5_sold_daily++;
        salesPerson.x5_sold++;
        switch (color) {
            case 1:
                new X5("Red");
                break;
            case 2:
                new X5("Blue");
                break;
            case 3:
                new X5("Green");
                break;
        }

    }

    private void buyX3(int color, SalesPerson salesPerson) {

        salesPerson.x3_sold++;
        salesPerson.x3_sold_daily++;
        switch (color) {
            case 1:
                new X3("Red");
                break;
            case 2:
                new X3("Blue");
                break;
            case 3:
                new X3("Green");
                break;
        }

    }

    private void buyX1(int color, SalesPerson salesPerson) {

        salesPerson.x1_sold++;
        salesPerson.x1_sold_daily++;
        switch (color) {
            case 1:
                new X1("Red");
                break;
            case 2:
                new X1("Blue");
                break;
            case 3:
                new X1("Green");
                break;
        }
    }

    SalesPerson selectSalesPerson() {
        System.out.println("Which of the following Sales Person is doing businees with you now?\n1. George\n2. Patrick\n3. Simpson");
        int salesPerson = scanner.nextInt();
        switch (salesPerson) {
            case 1:
                return george;
            case 2:
                return patrick;
            case 3:
                return simpson;
        }
        return null;
    }

    void customerView() {
        System.out.println("Welcome to Windsor Car-Mart\nHello What is your name?\n");
        String name = scanner.next();

        System.out.printf("Hey %s! How are you doing today\n", name);
        scanner.next();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give best car buying experience!!!\n", name, name);
        SalesPerson current = selectSalesPerson();
        System.out.printf("Great, You have selected %s as your salesperson\n", current.name);
        buyACar(current);
    }

    void chatBot() {

        int exitFromCustomerview = 0;

        do {
            System.out.printf("Hi User,\nWhich user are you \n1.Customer\n2.Manager\n3.Exit\n");
            exitFromCustomerview = scanner.nextInt();
            switch ((exitFromCustomerview)) {
                case 1:
                    customerView();
                    break;
                case 2:
                    generateReport();
                    break;
            }

        } while (exitFromCustomerview != 3);

    }

    private void generateReport() {
        System.out.println("Enter Manager Passkey");
        String managerPassword = scanner.next();
        if (managerPassword.equals("1234")) {

            System.out.println("Sales of X1");
            System.out.printf("Monthly Sales: %d \t Today's Sales:%d\n", X1.monthlyCount, X1.dailyCount);
            System.out.println("Sales by Sales person for X1");
            System.out.printf("1. %s \tMonthly: %d\tDaily: %d\n", george.name, george.x1_sold, george.x1_sold_daily);
            System.out.printf("2. %s \tMonthly: %d\tDaily: %d\n", patrick.name, patrick.x1_sold, patrick.x1_sold_daily);
            System.out.printf("3. %s \tMonthly: %d\tDaily: %d\n", simpson.name, simpson.x1_sold, simpson.x1_sold_daily);
            System.out.println("Sales of X3");
            System.out.printf("Monthly Sales: %d \t Today's Sales:%d\n", X3.monthlyCount, X3.dailyCount);
            System.out.println("Sales by Sales person for X3");
            System.out.printf("1. %s \tMonthly: %d\tDaily: %d\n", george.name, george.x3_sold, george.x3_sold_daily);
            System.out.printf("2. %s \tMonthly: %d\tDaily: %d\n", patrick.name, patrick.x3_sold, patrick.x3_sold_daily);
            System.out.printf("3. %s \tMonthly: %d\tDaily: %d\n", simpson.name, simpson.x3_sold, simpson.x3_sold_daily);
            System.out.println("Sales of X5");
            System.out.printf("Monthly Sales: %d \t Today's Sales:%d\n", X5.monthlyCount, X5.dailyCount);
            System.out.println("Sales by Sales person for X5");
            System.out.printf("1. %s \tMonthly: %d\tDaily: %d\n", george.name, george.x5_sold, george.x5_sold_daily);
            System.out.printf("2. %s \tMonthly: %d\tDaily: %d\n", patrick.name, patrick.x5_sold, patrick.x5_sold_daily);
            System.out.printf("3. %s \tMonthly: %d\tDaily: %d\n", simpson.name, simpson.x5_sold, simpson.x5_sold_daily);
        } else {
            System.out.println("Wrong Passkey, You don't have access to view report");
        }
    }
}
