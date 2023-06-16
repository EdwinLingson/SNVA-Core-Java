package corejava4;

import java.util.Scanner;

class Authenticate2 {
    String username;
    String password;

    public Authenticate2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Authenticate2() {

    }
    boolean checkPassword(String password){
        if(this.password.equals(password)) return true;
        return  false;
    }
}
class DisplayBalance2 extends Authenticate2 {
    double balance;
    Address address;

    public DisplayBalance2() {
        super();
    }

    public DisplayBalance2(String username, String password, double balance, Address address) {
        super(username, password);
        this.balance =balance;
        this.address = address;
    }
}
class ChatBot2 extends DisplayBalance2 {
    DisplayBalance2[] listOfAccounts = new DisplayBalance2[5];
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;
    String name;
    int addressTask;
    int task;
    public ChatBot2(String username, String password, double balance,Address address) {
        super(username, password, balance,address);
    }
    public ChatBot2(){
        super();
        listOfAccounts[0]=new DisplayBalance2("AB1001","password",200000,
                new Address("Cynthia Drive","3289","2","Bing",13905));
        listOfAccounts[1]=new DisplayBalance2("AB1002","password",305000,
        new Address("Cynthia Drive","3276","3","Bing",13902));
        listOfAccounts[2]=new DisplayBalance2("AB1003","password",400005,
                new Address("Cynthia Drive","3289","2","Bing",13905,"8714812764","6075632765"));
        listOfAccounts[3]=new DisplayBalance2("AB1004","password",870000,
                new Address("Sylvia Drive","3243","9","Bing",13905));
        listOfAccounts[4]=new DisplayBalance2("AB1005","password",980000,
                new Address("Madison Drive","289","1","NYC",10005));

    }
    void startBot(){

        System.out.println("Welcome to AB Bank\nHello What is your name?");
        name = scanner.nextLine();

        System.out.printf("Hey %s! How are you doing today\n",name);
        scanner.nextLine();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give best banking experience!!!\n",name,name);

        System.out.printf("So First, %s, Enter your Username\n",name);
        username = scanner.next();
        DisplayBalance2 currentUser = userDetails(listOfAccounts,username);
        if(!currentUser.username.equals("No User")){
            System.out.println("Enter Your password");
            password = scanner.next();
            if(currentUser.checkPassword(password)){
                System.out.printf("Welcome %s\nLogin is Success\n",name);
                currentUser.address.displayAddress(name);
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

    DisplayBalance2 userDetails(DisplayBalance2[] listOfAccounts, String username){
        for (DisplayBalance2 displayBalance2 :listOfAccounts) {
            if(displayBalance2.username.equals(username))
                return displayBalance2;
        }
        return new DisplayBalance2("No User","",0,null);
    }
}
class Address{

    String name;
    String doorNo;
    String streetNo;
    String locality;
    int zipcode;
    String mobile;
    String telephone;

    public Address(String name, String doorNo, String streetNo, String locality, int zipcode, String mobile, String telephone) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipcode = zipcode;
        this.mobile = mobile;
        this.telephone = telephone;
    }
    public Address(String name, String doorNo, String streetNo, String locality, int zipcode) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipcode = zipcode;
    }

    void updateAddress(String locality){
        this.locality = locality;
    }
    void updateAddress(String mobile, String telephone){
        this.mobile = mobile;
        this.telephone = telephone;
    }

    void displayAddress(String name){
        System.out.printf("Name: %s\t%s, %s, %s, %s, %d\nMobile:%s\t Telephone:%s\n",name,this.name,this.doorNo,streetNo,locality,zipcode,mobile,telephone);
    }
    @Override
    public String toString() {
        return "Name: " +name + " DoorNo: "+ doorNo + " streetNo: "+streetNo+ " locality: "+locality + " zipcode: "+ zipcode +
                " mobile: " +mobile + " telephone: "+ telephone +'\n';
    }
}

public class BankTaskV3 {
    public static void main(String[] args) {
        ChatBot2 chatBot = new ChatBot2();
        chatBot.startBot();
    }
    /**
     * Welcome to AB Bank
     * Hello What is your name?
     * Edwin
     * Hey Edwin! How are you doing today
     * Greatly exhausted :)
     * That's great to hear Edwin!
     * Edwin, and we are here to give best banking experience!!!
     * So First, Edwin, Enter your Username
     * AB1001
     * Enter Your password
     * password
     * Welcome Edwin
     * Login is Success
     * Name: Edwin	Cynthia Drive, 3289, 2, Bing, 13905
     * Mobile:null	 Telephone:null
     * What Do you want to do today?
     * 1.Know the balance?
     * 2.Change Address
     * 3.exit
     *
     * 1
     * Your Balance is: 200000.0
     * What Do you want to do today?
     * 1.Know the balance?
     * 2.Change Address
     * 3.exit
     *
     * 2
     * What do you want to change in address
     * 1.Add Phone numbers
     * 2.Change Locality
     * 2
     * Enter new Locality
     * Mozart
     * New Address:
     * Name: Cynthia Drive DoorNo: 3289 streetNo: 2 locality: Mozart zipcode: 13905 mobile: null telephone: null
     *
     * What Do you want to do today?
     * 1.Know the balance?
     * 2.Change Address
     * 3.exit
     *
     * 2
     * What do you want to change in address
     * 1.Add Phone numbers
     * 2.Change Locality
     * 1
     * Enter Mobile Number
     * 6703401860
     * Enter Telephone Number
     * 2404203368
     * New Address:
     * Name: Cynthia Drive DoorNo: 3289 streetNo: 2 locality: Mozart zipcode: 13905 mobile: 6703401860 telephone: 2404203368
     *
     * What Do you want to do today?
     * 1.Know the balance?
     * 2.Change Address
     * 3.exit
     *
     * 3
     * Thanks for the visit, See you Soon!!!
     *
     * Process finished with exit code 0
     */
}
