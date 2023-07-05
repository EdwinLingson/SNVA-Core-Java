package coreJava13.bankTask.bankTaskV7;

import corejava4.Address;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Bank7 {
    LinkedHashMap<String, PersonalUser> listOfUserAccounts ;
    LinkedHashMap<String, BussinesUser> listOfBusAccounts ;
    List<ManagerImpl> listOfManagers ;
    Authenticate7 authenticate;
    ChatBot7 chatBot7;

    public Bank7() {

        listOfManagers = createListofManagers();
        listOfUserAccounts  =createusers();
        listOfBusAccounts  =createBususers();
        authenticate = getAuthenticate();
        chatBot7 = createChatbot();
    }

    private LinkedHashMap<String, BussinesUser> createBususers() {
        LinkedHashMap<String, BussinesUser> listBus = new LinkedHashMap<>();
        listBus.put("AB1004",new BussinesUser("AB1004", "password", 870000,
                new Address("Sylvia Drive", "3243", "9", "Bing", 13905,"user3@msn.com")));
        listBus.put("AB1005",new BussinesUser("AB1005", "password", 980000,
                new Address("Madison Drive", "289", "1", "NYC", 10005,"user4@secretary.net")));

    return listBus;
    }

    Authenticate7 getAuthenticate(){
        return new Authenticate7(listOfUserAccounts,listOfBusAccounts, listOfManagers);
    }
    ChatBot7 createChatbot(){
        return new ChatBot7(authenticate);
    }
    List<ManagerImpl> createListofManagers(){
        List<ManagerImpl> listOfManagers = new ArrayList<ManagerImpl>(3);
        listOfManagers.add(new ManagerImpl("M1001", "mpassword"));
        listOfManagers.add(new ManagerImpl("M1002", "mpassword"));
        listOfManagers.add(new ManagerImpl("M1003", "mpassword"));
        return listOfManagers;
    }
    LinkedHashMap createusers(){
        LinkedHashMap<String, PersonalUser> listOfAccounts = new LinkedHashMap<>(3);
        listOfAccounts.put("AB1001",new PersonalUser("AB1001", "password", 200000,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905,"user1@gomail.com")));
        listOfAccounts.put("AB1002",new PersonalUser("AB1002", "password", 305000,
                new Address("Cynthia Drive", "3276", "3", "Bing", 13902,"user2@gmail.com")));
        listOfAccounts.put("AB1003",new PersonalUser("AB1003", "password", 400005,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905,"userwithtel1@hotmail.com","8714812764", "6075632765")));
        return listOfAccounts;
    }

    public LinkedHashMap<String, PersonalUser> getListOfUserAccounts() {
        return listOfUserAccounts;
    }

    public LinkedHashMap<String, BussinesUser> getListOfBusAccounts() {
        return listOfBusAccounts;
    }

    public List<ManagerImpl> getListOfManagers() {
        return listOfManagers;
    }

    void start() {
        chatBot7.start();
    }


}
