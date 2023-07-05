package coreJava12.bankTaskV7;

import coreJava10.bankTask.TakeInput;
import coreJava8.Person;
import coreJava8.UserImpl;
import corejava4.Address;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class ManagerImpl extends Person implements Manager {

    public ManagerImpl(String userName, String password) {
        super(userName, password);
    }

    public ManagerImpl(String userName) {
        super(userName);
    }
    @Override
    public LinkedHashMap<String, PersonalUser> addPersonalUser(PersonalUser personalUser, LinkedHashMap<String, PersonalUser> listOfPersonalUserAccounts) {

        listOfPersonalUserAccounts.put(personalUser.getUserName(),personalUser);
        return listOfPersonalUserAccounts;
    }

    @Override
    public LinkedHashMap<String, BussinesUser> addBussinessuser(BussinesUser bussinesUser, LinkedHashMap<String, BussinesUser> listOfBusUsers) {
        listOfBusUsers.put(bussinesUser.getUserName(),bussinesUser);
        return listOfBusUsers;
    }

    @Override
    public void listUsers(LinkedHashMap<String, BussinesUser> busUsers, LinkedHashMap<String, PersonalUser> personalUsers) {
        Iterator<BussinesUser> iterator = busUsers.values().iterator();
      System.out.println("---Business Users---");
        while (iterator.hasNext()){
          iterator.next().displayDetailsWithBalance();
        }
        System.out.println("---Personal Users---");
        Iterator<PersonalUser> personalUserIterator = personalUsers.values().iterator();
        while (personalUserIterator.hasNext()){
            personalUserIterator.next().displayDetailsWithBalance();
        }
    }

    @Override
    public void updatePersonalUser(LinkedHashMap personalUsers) {
        PersonalUser user = (PersonalUser) searchUser(personalUsers,true);
        if(user==null) {
            System.out.println("UserName given not found"); return;
        }
        System.out.println("Hi manager, what do you want to edit in a User?\n1.Username\n2.Password\n3.Address\n4.Exit without any edits");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:UserImpl editUser = editUserName(user); personalUsers.remove(user);personalUsers.put(editUser.getUserName(),editUser);break;
            case 2:editPassWord(user);break;
            case 3:editAddress(user);break;
            case 4:System.out.println("Thanks for the visit!!!");break;
        }
    }

    @Override
    public void updateBusUser(LinkedHashMap busUsers) {
        BussinesUser user = (BussinesUser) searchUser(busUsers,true);
        if(user==null) {
            System.out.println("UserName given not found"); return;
        }
        System.out.println("Hi manager, what do you want to edit in a User?\n1.Username\n2.Password\n3.Address\n4.Exit without any edits");
        int selection = TakeInput.nullCheck(TakeInput.readInteger());
        switch (selection){
            case 1:UserImpl editUser = editUserName(user); busUsers.remove(user.getUserName());busUsers.put(editUser.getUserName(),editUser);break;
            case 2:editPassWord(user);break;
            case 3:editAddress(user);break;
            case 4:System.out.println("Thanks for the visit!!!");break;
        }
    }

    @Override
    public void deletePersonalUser(LinkedHashMap<String, PersonalUser> personalUsers) {
        System.out.println("Enter username to be edited");
        String userNameSearch = TakeInput.readString();
        UserImpl user  = personalUsers.remove(userNameSearch);
        if(user==null)
        System.out.println(userNameSearch + "Is Not Found and is no deleted!!!");
        else System.out.println(user.getUserName() + " is Deleted!!!");
    }
    @Override
    public void deleteBusUser(LinkedHashMap<String, BussinesUser> bussinessUsers) {
        System.out.println("Enter username to be edited");
        String userNameSearch = TakeInput.readString();
        UserImpl user  = bussinessUsers.remove(userNameSearch);
        if(user==null)
            System.out.println(userNameSearch + "Is Not Found and is no deleted!!!");
        else System.out.println(user.getUserName() + " is Deleted!!!");
    }
    UserImpl createUserbject(int type){
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
        switch (type){
            case 1: return new PersonalUser(newUsername,newPassword,balance,newAddress);
            case 2: return new BussinesUser(newUsername,newPassword,balance,newAddress);
        }
        return null;
    }
    @Override
    public LinkedHashMap<String, BussinesUser> addBussinesUser(LinkedHashMap<String, BussinesUser> busUsers) {
        BussinesUser bussinesUser = (BussinesUser) createUserbject(2);
        busUsers.put(bussinesUser.getUserName(),bussinesUser);
        return  busUsers;
    }

    @Override
    public LinkedHashMap<String, PersonalUser> addPersonalUser(LinkedHashMap<String, PersonalUser> personalUsers) {
        PersonalUser personalUser = (PersonalUser) createUserbject(1);
        personalUsers.put(personalUser.getUserName(),personalUser);
        return  personalUsers;
    }

    @Override
    public UserImpl searchUser(LinkedHashMap listUsers, boolean calledFromEdit) {
        if(!calledFromEdit){
            System.out.println("Enter the username to be searched");
        }
        else System.out.println("Enter username to be edited");
        String userNameSearch = TakeInput.readString();
        UserImpl user = (UserImpl) listUsers.get(userNameSearch);
        if(!calledFromEdit && user==null) System.out.println(userNameSearch + " is Not Found!!!");
        else if(!calledFromEdit) {
            System.out.println(user.getUserName() + " is Found!!!");
            user.displayDetailsWithBalance();
        }
        return user;
    }

    @Override
    public boolean authenticate(String mname, String pwd) {
        if(mname.equals("No User")) return false;
        return mname.equals(getUserName()) && pwd.equals(getPassword());
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

    private UserImpl editUserName(UserImpl user) {
        System.out.println("Old username is: "+user.getUserName() );
        System.out.println("Enter New UserName");
        String newUserName = TakeInput.readString();
        user.setUserName(newUserName);
        return user;
    }
}
