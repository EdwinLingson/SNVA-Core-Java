package coreJava8;

import corejava4.Address;

import java.util.Scanner;

class UserImpl extends Person implements User {
    public UserImpl(String userName, String password, int balance, Address address) {
        super(userName, password);
        this.balance = balance;
        this.address = address;
    }

    public UserImpl(String userName) {
        super(userName);
    }

    private int balance;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void displayBalance(Scanner scanner) {
        System.out.println("Do You want to display Balance:\n1.Yes\n2.No");
        int knowBalance = scanner.nextInt();
        switch (knowBalance) {
            case 1:
                System.out.println("Your balance is " + getBalance());
                break;
            case 2:
                System.out.println("Thanks for Banking with us");
        }

    }

    @Override
    public void displayDetails() {
        System.out.printf("Username:%s\n", getUserName());
        address.displayAddress(getUserName());
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    boolean authenticate(String uname, String password) {
        if (uname.equals(getUserName()) && password.equals(getPassword())) return true;
        return false;
    }

}
