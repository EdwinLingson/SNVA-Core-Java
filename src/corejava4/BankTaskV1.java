package corejava4;

import java.util.Scanner;

class Bank{
    String account_id;
    String password;
    double balance;

    public Bank(String account_id, String password, double balance) {
        this.account_id = account_id;
        this.password = password;
        this.balance = balance;
    }
    boolean checkPassword(String password){
        if(this.password.equals(password)) return true;
        return  false;
    }
}
public class BankTaskV1 {

    public static void main(String[] args) {
        Bank [] listOfAccounts = new Bank[5];
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        String name;
        char knowBalance;
        listOfAccounts[0]=new Bank("AB1001","password",200000);
        listOfAccounts[1]=new Bank("AB1002","password",305000);
        listOfAccounts[2]=new Bank("AB1003","password",400005);
        listOfAccounts[3]=new Bank("AB1004","password",870000);
        listOfAccounts[4]=new Bank("AB1005","password",980000);

        System.out.println("Welcome to AB Bank\nHello What is your name?");
        name = scanner.nextLine();

        System.out.printf("Hey %s! How are you doing today\n",name);
        scanner.nextLine();

        System.out.printf("That's great to hear %s!\n %s, and we are here to give best banking experience!!!\n",name,name);

        System.out.printf("So First, %s, Enter your Username\n",name);
        username = scanner.next();
        Bank currentUser = userDetails(listOfAccounts,username);
        if(!currentUser.account_id.equals("No User")){
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
    static Bank userDetails(Bank[] listOfAccounts, String username){
        for (Bank bank:listOfAccounts) {
            if(bank.account_id.equals(username))
                return bank;
        }
        return new Bank("No User","",0);
    }
}
