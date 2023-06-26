package coreJava8;

import corejava4.Address;

import java.util.Scanner;

class Bank {
    Scanner scanner = new Scanner(System.in);
    UserImpl[] listOfAccounts = new UserImpl[10];
    int noOfusers;
    ManagerImpl[] listOfManagers = new ManagerImpl[3];

    public Bank() {
        listOfAccounts[0] = new UserImpl("AB1001", "password", 200000,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905)) {
        };
        listOfAccounts[1] = new UserImpl("AB1002", "password", 305000,
                new Address("Cynthia Drive", "3276", "3", "Bing", 13902));
        listOfAccounts[2] = new UserImpl("AB1003", "password", 400005,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905, "8714812764", "6075632765"));
        listOfAccounts[3] = new UserImpl("AB1004", "password", 870000,
                new Address("Sylvia Drive", "3243", "9", "Bing", 13905));
        listOfAccounts[4] = new UserImpl("AB1005", "password", 980000,
                new Address("Madison Drive", "289", "1", "NYC", 10005));
        listOfManagers[0] = new ManagerImpl("M1001","mpassword");
        listOfManagers[1] = new ManagerImpl("M1002","mpassword");
        listOfManagers[2] = new ManagerImpl("M1003","mpassword");
        noOfusers =5;
    }

    void userView() {
        System.out.println("Welcome to Windsor Bank\nHello What is your name?\n");
        String name = scanner.next();

        System.out.printf("Hey %s! How are you doing today\n", name);
        scanner.next();

        System.out.printf("That's great to hear %s!\n%s, and we are here to give Banking experience!!!\n", name, name);
        System.out.println("Please enter your username");
        String uname = scanner.next();
        UserImpl currentUser = searchUser(uname);
        System.out.println("Please enter your password");
        String pass = scanner.next();
        if (currentUser.authenticate(uname, pass)) {
            System.out.println("Your Log In is success");
            currentUser.displayBalance(scanner);
        } else {
            System.out.println("Username or Password is incorrect");
        }

    }



    UserImpl searchUser(String username) {
        for (UserImpl user : listOfAccounts) {
            if (username.equals(user.getUserName())) return user;
        }
        return new UserImpl("No User");
    }
    ManagerImpl searchManager(String username) {
        for (ManagerImpl manager : listOfManagers) {
            if (username.equals(manager.getUserName())) return manager;
        }
        return new ManagerImpl("No User");
    }

    void chatbot() {
        int selection;
        do {
            System.out.println("Hi User, which view do you want today?\n1.User\n2.Manager\n3.Exit");
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    userView();
                    break;
                case 2:
                    managerView();
                    break;
            }
        } while (selection != 3);
        System.out.println("Thanks for the visit!!!");

    }

    private void managerView() {

            System.out.println("Welcome to Windsor Bank's Manager\nHello What is your name?");
            String name = scanner.next();

            System.out.printf("Hey Manager %s! How are you doing today\n", name);
            scanner.next();

            System.out.printf("That's great to hear %s!\n%s, and we are have to prove that you are a Manager!!!\n", name, name);
            System.out.println("So, Please enter your username");
            String uname = scanner.next();
            ManagerImpl currentManager = searchManager(uname);
            System.out.println("Please enter your password");
            String pass = scanner.next();
            int selection;
            if (currentManager.authenticate(uname, pass)) {
                System.out.println("Your Log In is success");
                do {
                    System.out.println("What do you want to do today?\n1.Add new user\n2.List Users\n3.Exit from Manager view");

                     selection= scanner.nextInt();
                    switch (selection) {
                        case 1:
                            listOfAccounts = currentManager.addUser(scanner, listOfAccounts, ++noOfusers);
                            break;
                        case 2:
                            currentManager.listUsers(listOfAccounts);
                            break;
                    }
                }while (selection!=3);
            }else {
                System.out.println("Username or Password is incorrect");
            }

        }

}
