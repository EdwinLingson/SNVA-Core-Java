package coreJava8;

import coreJava10.bankTask.TakeInput;
import corejava4.Address;

import java.util.Scanner;

public class UserImpl extends Person implements User {
    private int balance;
    private Address address;
    public UserImpl(String userName, String password, int balance, Address address) {
        super(userName, password);
        this.balance = balance;
        this.address = address;
    }

    public UserImpl(String userName) {
        super(userName);
    }



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
    public void displayBalance() {
        System.out.println("Do You want to display Balance:\n1.Yes\n2.No");
        Integer knowBalance = TakeInput.nullCheck(TakeInput.readInteger());
        switch (knowBalance) {
            case 1:
                System.out.println("Your balance is " + getBalance());
                break;
            case 2:
                System.out.println("Thanks for Banking with us");break;
            default:
                System.out.println("Invalid Option");
        }

    }
    public void displayBalance(Integer knowBalance) {

        switch (knowBalance) {
            case 1:
                System.out.println("Your balance is " + getBalance());
                break;
            case 2:
                System.out.println("Thanks for Banking with us");break;
            default:
                System.out.println("Invalid Option");
        }

    }

    @Override
    public void displayDetails() {
        System.out.printf("Username:%s\n", getUserName());
        address.displayAddress(getUserName());
    }
    public void displayDetailsWithBalance() {
        System.out.printf("Username:%s\n", getUserName());
        address.displayAddress(getUserName());
        System.out.println("Balance:" + getBalance());
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean authenticate(String uname, String password) {
        return uname.equals(getUserName()) && password.equals(getPassword());
    }

    @Override
    public void editUser() {

    }
}
