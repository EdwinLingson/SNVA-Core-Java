package coreJava5;

import corejava4.Address;

import java.util.Scanner;

class Bank{
    String name;
    String username;
    String password;
    double balance;
    Address address;

    public Bank(String username, String password, double balance, Address address) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.address = address;
    }
    boolean checkPassword(String password){
        if(this.password.equals(password)) return true;
        return  false;
    }
    void setName(String name){
        this.name=name;
    }
    public void displayDetails(String name){
        address.displayAddress(this.name);
    }
}
class PersonalAccount extends Bank{
    String accountHolderName;
    String type;

    public PersonalAccount(String username, String password, double balance, Address address, String acountHolderName) {
        super(username, password, balance, address);
        this.accountHolderName = acountHolderName;
        this.type="Personal";
    }
    public void displayDetails(String name){
        address.displayAddress(this.accountHolderName,this.type,this.name);
        }
}
class BussinessAccount extends Bank{
    String bussinessName;
    String type;

    public BussinessAccount(String username, String password, double balance, Address address, String bussinessName) {
        super(username, password, balance, address);
        this.type = "Businees";
        this.bussinessName = bussinessName;
    }
    public void displayDetails(String name){
        address.displayAddress(this.bussinessName,this.type,this.name);
    }
}

class ChatBotV4 {
    Bank[] listOfAccounts = new Bank[5];
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;
    String name;
    int addressTask;
    int task;
    public ChatBotV4(){
        super();
        listOfAccounts[0]=new PersonalAccount("AB1001","password",200000,
                new Address("Cynthia Drive","3289","2","Bing",13905),"Henry");
        listOfAccounts[1]=new PersonalAccount("AB1002","password",305000,
                new Address("Cynthia Drive","3276","3","Bing",13902),"Alaistor");
        listOfAccounts[2]=new PersonalAccount("AB1003","password",400005,
                new Address("Cynthia Drive","3289","2","Bing",13905,
                        "8714812764","6075632765"),"Roger");
        listOfAccounts[3]=new BussinessAccount("AB1004","password",870000,
                new Address("Sylvia Drive","3243","9","Bing",13905),"General Bus Transports");
        listOfAccounts[4]=new BussinessAccount("AB1005","password",980000,
                new Address("Madison Drive","289","1","NYC",10005),"Aerojet");

    }
    void startBot(){

        System.out.println("Welcome to AB Bank\nHello What is your name?");
        name = scanner.nextLine();

        System.out.printf("Hey %s! How are you doing today\n",name);
        scanner.nextLine();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give best banking experience!!!\n",name,name);

        System.out.printf("So First, %s, Enter your Username\n",name);
        username = scanner.next();
        Bank currentUser = userDetails(listOfAccounts,username);
        currentUser.setName(name);
        if(!currentUser.username.equals("No User")){
            System.out.println("Enter Your password");
            password = scanner.next();
            if(currentUser.checkPassword(password)){
                System.out.printf("Welcome %s\nLogin is Success\n",name);
                currentUser.displayDetails(name);
                do {
                    System.out.println("What Do you want to do today?\n1.Know the balance?\n2.Change Address\n3.exit\n");
                    task = scanner.nextInt();
                    switch (task){
                        case 1:System.out.println("Your Balance is: " + currentUser.balance);
                            break;
                        case 2:
                            System.out.printf("What do you want to change in address\n1.Add Phone numbers\n2.Change Locality\n");
                            addressTask = scanner.nextInt();
                            switch (addressTask){
                                case 1:
                                    System.out.println("Enter Mobile Number");
                                    String mnumber = scanner.next();
                                    System.out.println("Enter Telephone Number");
                                    String hnumber = scanner.next();
                                    currentUser.address.updateAddress(mnumber,hnumber);
                                    break;
                                case 2:
                                    System.out.println("Enter new Locality");
                                    String  nlocality = scanner.next();
                                    currentUser.address.updateAddress(nlocality);
                                    break;
                            }
                            System.out.println("New Address: \n"+currentUser.address);
                    }

                }while (task!=3);
            }
            else {
                System.out.printf("Sorry %s,Login Failed due to invalid username or password\n",name);
            }
        }
        System.out.println("Thanks for the visit, See you Soon!!!");

    }

    Bank userDetails(Bank[] listOfAccounts, String username){
        for (Bank displayBalance2 :listOfAccounts) {
            if(displayBalance2.username.equals(username))
                return displayBalance2;
        }
        return new Bank("No User","",0,null);
    }
}

public class BankTaskV4 {

    public static void main(String[] args) {
        ChatBotV4 chatBotV41 = new ChatBotV4();
        chatBotV41.startBot();
    }
}
