package coreJava12.bankTaskV7;

import coreJava10.bankTask.TakeInput;
import coreJava8.UserImpl;

import java.util.LinkedHashMap;
import java.util.List;

public class ChatBot7 {
    Authenticate7 authenticate;
    LinkedHashMap<String,PersonalUser> listOfPersonalUserAccounts ;
    LinkedHashMap<String, BussinesUser> listOfBusAccounts ;
    public List<ManagerImpl> listOfManagers;

    public ChatBot7(Authenticate7 authenticate) {
        this.authenticate = authenticate;
        this.listOfPersonalUserAccounts = authenticate.listOfPersonalUserAccounts;
        this.listOfBusAccounts = authenticate.listOfBusAccounts;
        this.listOfManagers = authenticate.listOfManagers;
    }

    void userView() {
        System.out.println("Welcome to Windsor Bank\nHello What is your name?\n");
        String name = TakeInput.readString();

        System.out.printf("Hey %s! How are you doing today\n", name);
        TakeInput.readString();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give Banking experience!!!\n", name, name);
        System.out.println("Please enter your username");
        String uname = TakeInput.readString();
        System.out.println("Which Type of Banking do you do?\n1.Personal\n2.Bussiness");
        int bankingType=TakeInput.nullCheck(TakeInput.readInteger());
        switch (bankingType){
            case 1: personalUserView(uname);break;
            case 2: businessView(uname);break;
            default:
                System.out.println("invalid Option");
        }

    }

    void personalUserView(String uname){
        PersonalUser personalUser= authenticate.searchPersonalUser(uname);
        System.out.println("Please enter your password");
        String pass = TakeInput.readString();
        if (authenticate.isAuthenticated(personalUser,uname,pass)) {
            System.out.println("Your Log In is success");
            Integer knowBalance;
            do {
                System.out.println("Do You want to display Balance:\n1.Yes\n2.No\n3.Exit");
                knowBalance = TakeInput.nullCheck(TakeInput.readInteger());
                personalUser.displayBalance(knowBalance);
            } while (knowBalance != 3);
        } else {
            System.out.println("Username or Password is incorrect");
        }

    }
    void businessView(String uname){
        BussinesUser bussinesUser = authenticate.searchBusUser(uname);
        System.out.println("Please enter your password");
        String pass = TakeInput.readString();
        if (authenticate.isAuthenticated(bussinesUser,uname,pass)) {
            System.out.println("Your Log In is success");
            Integer knowBalance;
            do {
                System.out.println("Do You want to display Balance:\n1.Yes\n2.No\n3.Exit");
                knowBalance = TakeInput.nullCheck(TakeInput.readInteger());
                bussinesUser.displayBalance(knowBalance);
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
                case 3:
                    System.out.println("Bye Bye!!!"); break;
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
                System.out.println("What do you want to do today?\n1.Add new user\n2.List Users\n3.Edit User\n4.List User" +
                        "\n5.Delete User\n6.Exit from Manager view");

                selection= TakeInput.nullCheck(TakeInput.readInteger());
                switch (selection) {
                    case 1: addUser(currentManager);break;
                    case 2: currentManager.listUsers(listOfBusAccounts,listOfPersonalUserAccounts);break;
                    case 3: updateUser(currentManager);break;
                    case 5: deleteUser(currentManager);break;
                    case 4: searchUser(currentManager);break;
                    case 6: System.out.println("Thanks for the Visit!!!"); break;
                    default:
                        System.out.println("Invalid option");
                }
            }while (selection!=6);
        }else {
            System.out.println("Username or Password is incorrect");
        }

    }

    private void searchUser(ManagerImpl currentManager) {
        System.out.println("Which type of Bank account you want to Search?\n1.Personal\n2.Business");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:currentManager.searchUser(listOfPersonalUserAccounts,false);break;
            case 2: currentManager.searchUser(listOfBusAccounts,false);break;
            default:
                System.out.println("Invalid Option");
        }
    }

    private void deleteUser(ManagerImpl currentManager) {
        System.out.println("Which type of Bank account you want to Delete?\n1.Personal\n2.Business");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:currentManager.deletePersonalUser(listOfPersonalUserAccounts);break;
            case 2: currentManager.deleteBusUser(listOfBusAccounts);break;
            default:
                System.out.println("Invalid Option");
        }
    }

    private void updateUser(ManagerImpl currentManager) {
        System.out.println("Which type of Bank account you want to Update?\n1.Personal\n2.Business");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:currentManager.updatePersonalUser(listOfPersonalUserAccounts);break;
            case 2: currentManager.updateBusUser(listOfBusAccounts);break;
            default:
                System.out.println("Invalid Option");
        }
    }

    private void addUser(ManagerImpl currentManager) {
        System.out.println("Which type of Bank account you want to Open?\n1.Personal\n2.Business");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:currentManager.addPersonalUser(listOfPersonalUserAccounts);break;
            case 2: currentManager.addBussinesUser(listOfBusAccounts);break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
