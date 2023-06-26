package coreJava8;

import java.util.Scanner;

public interface Manager {
    UserImpl[] addUser(Scanner scanner,UserImpl[] listOfAccounts,int noOfUsers);
    void listUsers(UserImpl[] listOfAccounts);
}
