package coreJava10.bankTask;

import coreJava8.ManagerImpl;
import coreJava8.UserImpl;

import java.util.List;

public class ChatBot {
    Authenticate authenticate;
    List<UserImpl> listOfAccounts;
    List<ManagerImpl> listOfManagers;
    ChatBot(Authenticate authenticate){
        this.authenticate = authenticate;
        listOfAccounts = authenticate.listOfusers;
        listOfManagers = authenticate.listOfManagers;
    }
    void userView() {
        System.out.println("Welcome to Windsor Bank\nHello What is your name?\n");
        String name = TakeInput.readString();

        System.out.printf("Hey %s! How are you doing today\n", name);
        TakeInput.readString();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give Banking experience!!!\n", name, name);
        System.out.println("Please enter your username");
        String uname = TakeInput.readString();
        UserImpl currentUser = authenticate.searchUser(uname);
        System.out.println("Please enter your password");
        String pass = TakeInput.readString();
        if (authenticate.isAuthenticated(currentUser,uname,pass)) {
            System.out.println("Your Log In is success");
            Integer knowBalance;
            do {
                System.out.println("Do You want to display Balance:\n1.Yes\n2.No\n3.Exit");
                knowBalance = TakeInput.nullCheck(TakeInput.readInteger());
                currentUser.displayBalance(knowBalance);
            } while (knowBalance != 3);
        } else {
            System.out.println("Username or Password is incorrect");
        }

    }





    void start() {
        int selection;
        do {
            System.out.println("Hi User, which view do you want today?\n1.User\n2.Manager\n3.Exit");
            selection = TakeInput.nullCheck(TakeInput.readInteger());
            switch (selection) {
                case 1:
                    userView();
                    break;
                case 2:
                    managerView();
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (selection != 3);
        System.out.println("Thanks for the visit!!!");

    }

    private void managerView() {

        System.out.println("Welcome to Windsor Bank's Manager\nHello What is your name?");
        String name = TakeInput.readString();

        System.out.printf("Hey Manager %s! How are you doing today\n", name);
        TakeInput.readString();

        System.out.printf("That's great to hear %s!\n%s, and we are have to prove that you are a Manager!!!\n", name, name);
        System.out.println("So, Please enter your username");
        String uname = TakeInput.readString();
        ManagerImpl currentManager = authenticate.searchManager(uname);
        System.out.println("Please enter your password");
        String pass = TakeInput.readString();
        int selection;
        if (authenticate.isAuthenticated(currentManager,uname, pass)) {
            System.out.println("Your Log In is success");
            do {
                System.out.println("What do you want to do today?\n1.Add new user\n2.List Users\n3.Exit from Manager view");

                selection= TakeInput.nullCheck(TakeInput.readInteger());
                switch (selection) {
                    case 1:
                        listOfAccounts = currentManager.addUser(listOfAccounts);
                        break;
                    case 2:
                        currentManager.listUsers(listOfAccounts);
                        break;
                    case 3:
                        System.out.println("Thank fo the Visit!!!"); break;
                    default:
                        System.out.println("Invalid option");
                }
            }while (selection!=3);
        }else {
            System.out.println("Username or Password is incorrect");
        }

    }
}
