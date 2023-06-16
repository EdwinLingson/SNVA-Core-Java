package corejava4;

import java.util.Scanner;

class Authenticate {
    String username;
    String password;

    public Authenticate(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Authenticate() {

    }
    boolean checkPassword(String password){
        if(this.password.equals(password)) return true;
        return  false;
    }
}
class DisplayBalance extends Authenticate{
    double balance;

    public DisplayBalance() {
        super();
    }

    public DisplayBalance(String username, String password, double balance) {
        super(username, password);
        this.balance =balance;
    }
}
class ChatBot extends DisplayBalance{
    DisplayBalance [] listOfAccounts = new DisplayBalance[5];
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;
    String name;
    char knowBalance;

    public ChatBot(){
        super();
        listOfAccounts[0]=new DisplayBalance("AB1001","password",200000);
        listOfAccounts[1]=new DisplayBalance("AB1002","password",305000);
        listOfAccounts[2]=new DisplayBalance("AB1003","password",400005);
        listOfAccounts[3]=new DisplayBalance("AB1004","password",870000);
        listOfAccounts[4]=new DisplayBalance("AB1005","password",980000);

    }
    void startBot(){

        System.out.println("Welcome to AB Bank\nHello What is your name?");
        name = scanner.nextLine();

        System.out.printf("Hey %s! How are you doing today\n",name);
        scanner.nextLine();

        System.out.printf("That's great to hear %s!\n %s, and we are here to give best banking experience!!!\n",name,name);

        System.out.printf("So First, %s, Enter your Username\n",name);
        username = scanner.next();
        DisplayBalance currentUser = userDetails(listOfAccounts,username);
        if(!currentUser.username.equals("No User")){
            System.out.println("Enter Your password");
            password = scanner.next();
            if(currentUser.checkPassword(password)){
                System.out.printf("Welcome %s\nLogin is Success\n",name);
                do {
                    System.out.println("Do you want to know the balance? Yes[y]/No[n] or exit[e]");
                    knowBalance = Character.toLowerCase(scanner.next().charAt(0));
                    switch (knowBalance) {
                        case 'y':
                            System.out.println("Your Balance is: " + currentUser.balance);
                            break;
                        case 'n':
                            System.out.println("No Problem!!! Thanks");
                    }
                }while (knowBalance!='e');
            }
            else {
                System.out.printf("Sorry %s,Login Failed due to invalid username or password\n",name);
            }
        }
        System.out.println("Thanks for the visit, See you Soon!!!");

    }

    DisplayBalance userDetails(DisplayBalance[] listOfAccounts, String username){
        for (DisplayBalance displayBalance:listOfAccounts) {
            if(displayBalance.username.equals(username))
                return displayBalance;
        }
        return new DisplayBalance("No User","",0);
    }
}
public class BankTaskV2 {
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        chatBot.startBot();
    }
}
