package coreJava8;

import corejava4.Address;

import java.util.Scanner;

class ManagerImpl extends Person implements Manager{
    public ManagerImpl(String userName, String password) {
        super(userName, password);
    }

    public ManagerImpl(String userName) {
        super(userName);
    }

    @Override
    public boolean authenticate(String mname, String password) {
        if(mname.equals("No User")) return false;
        return mname.equals(getUserName()) && password.equals(getPassword());
    }

    @Override
    public UserImpl[] addUser(Scanner scanner,UserImpl[] listOfAccounts,int numberOfUsers) {
        System.out.println("Enter UserName for new User");
        String newUsername = scanner.next();
        System.out.println("Enter Password for new User");
        String newPassword = scanner.next();
        System.out.println("Enter Initial deposit");
        int balance = scanner.nextInt();
        //String name, String doorNo, String streetNo, String locality, int zipcode
        System.out.println("Enter Street name of address for new User");
        String newStreetName = scanner.next();
        System.out.println("Enter Door No for new User");
        String newDoorNo = scanner.next();
        System.out.println("Enter Street No for new User");
        String newStreetNo = scanner.next();
        System.out.println("Enter Locality for new User");
        String newLocality = scanner.next();
        System.out.println("Enter Zipcode for new User");
        int newZipcode = scanner.nextInt();

        Address newAddress = new Address(newStreetName,newDoorNo,newStreetNo,newLocality,newZipcode);
        listOfAccounts[numberOfUsers] = new UserImpl(newUsername,newPassword,balance,newAddress);

        return listOfAccounts;

    }

    @Override
    public void listUsers(UserImpl[] listOfAccounts) {
        for (UserImpl user:listOfAccounts) {
            if(user!=null)
                user.displayDetailsWithBalance();
        }
    }
}
