package coreJava8;

import coreJava10.bankTask.TakeInput;
import corejava4.Address;

import java.util.List;
import java.util.Scanner;

public class ManagerImpl extends Person implements Manager{
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
    UserImpl createUserbject(){
        System.out.println("Enter UserName for new User");
        String newUsername = TakeInput.readString();
        System.out.println("Enter Password for new User");
        String newPassword = TakeInput.readString();
        System.out.println("Enter Initial deposit");
        int balance = TakeInput.nullCheck(TakeInput.readInteger());
        //String name, String doorNo, String streetNo, String locality, int zipcode
        System.out.println("Enter Street name of address for new User");
        String newStreetName = TakeInput.readString();
        System.out.println("Enter Door No for new User");
        String newDoorNo = TakeInput.readString();
        System.out.println("Enter Street No for new User");
        String newStreetNo = TakeInput.readString();
        System.out.println("Enter Locality for new User");
        String newLocality = TakeInput.readString();
        System.out.println("Enter Zipcode for new User");
        int newZipcode = TakeInput.nullCheck(TakeInput.readInteger());

        Address newAddress = new Address(newStreetName,newDoorNo,newStreetNo,newLocality,newZipcode);
        return new UserImpl(newUsername,newPassword,balance,newAddress);
    }
    @Override
    public UserImpl[] addUser(Scanner scanner,UserImpl[] listOfAccounts,int numberOfUsers) {

        listOfAccounts[numberOfUsers] = createUserbject();

        return listOfAccounts;

    }

    @Override
    public List<UserImpl> addUser(List<UserImpl> listOfAccounts) {
        listOfAccounts.add(createUserbject());
        return  listOfAccounts;
    }

    @Override
    public void listUsers(UserImpl[] listOfAccounts) {
        for (UserImpl user:listOfAccounts) {
            if(user!=null)
                user.displayDetailsWithBalance();
        }
    }
    @Override
    public void listUsers(List<UserImpl>listOfAccounts) {
        for (UserImpl user:listOfAccounts) {
            user.displayDetailsWithBalance();
        }
    }

    @Override
    public void updateUser(List<UserImpl> userList) {
        UserImpl user = searchUser(userList,true);
        if(user==null) {
            System.out.println("UserName given not found"); return;
        }
        System.out.println("Hi manager, what do you want to edit in a User?\n1.Username\n2.Password\n3.Address\n4.Exit without any edits");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:editUserName(user);break;
            case 2:editPassWord(user);break;
            case 3:editAddress(user);break;
            case 4:System.out.println("Thanks for the visit!!!");break;
        }
    }

    private void editAddress(UserImpl user) {
        int selection =0;
        do {
            System.out.println("What do you want to edit in Address\n.1.name\n2.doorNo\n3.streetNo\n4.locality\n5.zipcode" +
                    "\n6.email\n7.mobile\n8.telephone\n9.Exit");
            selection = TakeInput.nullCheck(TakeInput.readInteger());
            switch (selection){
                case 1: String newName = TakeInput.readString("Enter new name"); user.getAddress().setName(newName);
                    System.out.println("Name has been changed");break;
                case 2: String newDoorNo = TakeInput.readString("Enter new Door No"); user.getAddress().setDoorNo(newDoorNo);
                    System.out.println("Door No has been changed");break;
                case 3: String newStreetName = TakeInput.readString("Enter new Street name"); user.getAddress().setStreetNo(newStreetName);
                    System.out.println("Street Name has been changed");break;
                case 4: String newLocality = TakeInput.readString("Enter new Locality"); user.getAddress().setLocality(newLocality);
                    System.out.println("Locality has been changed");break;
                case 5: Integer newZip = TakeInput.nullCheck(TakeInput.readInteger("Enter new Zip Code")); user.getAddress().setZipcode(newZip);
                    System.out.println("Zip has been changed");break;
                case 6: String newEmail = TakeInput.readString("Enter new email"); user.getAddress().setEmail(newEmail);
                    System.out.println("Email has been changed");break;
                case 7: String newMobile= TakeInput.readString("Enter new Mobile"); user.getAddress().setMobile(newMobile);
                    System.out.println("Mobile has been changed");break;
                case 8: String newTelephone = TakeInput.readString("Enter new Telephone"); user.getAddress().setTelephone(newTelephone);
                    System.out.println("Telephone has been changed");break;
                case 9:
                    System.out.println("Thanks for the Visit!!!");break;
                default:
                    System.out.println("Invalid Option");
            }
        }while (selection!=9);
    }

    private void editPassWord(UserImpl user) {
        System.out.println("Old Password is: "+user.getPassword() );
        System.out.println("Enter New Password");
        String newPassword = TakeInput.readString();
        user.setPassword(newPassword);
    }

    private void editUserName(UserImpl user) {
        System.out.println("Old username is: "+user.getUserName() );
        System.out.println("Enter New UserName");
        String newUserName = TakeInput.readString();
        user.setUserName(newUserName);
    }

    @Override
    public void deleteUser(List<UserImpl> users) {
        System.out.println("Enter username to be edited");
        String userNameSearch = TakeInput.readString();
        for (UserImpl user : users) {
            if (userNameSearch.equals(user.getUserName())) {
                System.out.println(user.getUserName() +" Is Deleted!!!");
                users.remove(user);
                return;}
        }
        System.out.println(userNameSearch + "Is Not Found!!!");
    }

    @Override
    public UserImpl searchUser( List<UserImpl> users,boolean calledFromEdit) {
        if(!calledFromEdit){
            System.out.println("Enter the username to be searched");
        }
        else System.out.println("Enter username to be edited");
        String userNameSearch = TakeInput.readString();
        for (UserImpl user : users) {
            if (userNameSearch.equals(user.getUserName())) {
                if(!calledFromEdit) user.displayDetailsWithBalance();
                return user;
            }
        }
        if(!calledFromEdit) System.out.println(userNameSearch + " is Not Found!!!");
        return null;
    }
}
