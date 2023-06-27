package coreJava11.bankTaskV6;

import coreJava10.bankTask.Authenticate;
import coreJava8.ManagerImpl;
import coreJava8.UserImpl;
import corejava4.Address;

import java.util.ArrayList;
import java.util.List;

class BankV6 {
    List<UserImpl> listOfAccounts ;
    List<ManagerImpl> listOfManagers ;
    Authenticate authenticate;
    ChatBotV6 chatBotV6;

    public BankV6() {

        listOfManagers = createListofManagers();
        listOfAccounts  =createusers();
        authenticate = getAuthenticate();
        chatBotV6 = createChatbot();
    }
    Authenticate getAuthenticate(){
        return new Authenticate(listOfAccounts, listOfManagers);
    }
    ChatBotV6 createChatbot(){
        return new ChatBotV6(authenticate);
    }
    List<ManagerImpl> createListofManagers(){
        List<ManagerImpl> listOfManagers = new ArrayList<ManagerImpl>(3);
        listOfManagers.add(new ManagerImpl("M1001", "mpassword"));
        listOfManagers.add(new ManagerImpl("M1002", "mpassword"));
        listOfManagers.add(new ManagerImpl("M1003", "mpassword"));
        return listOfManagers;
    }
    List<UserImpl> createusers(){
        List<UserImpl> listOfAccounts = new ArrayList<UserImpl>(3);
        listOfAccounts.add(new UserImpl("AB1001", "password", 200000,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905,"user1@gomail.com")));
        listOfAccounts.add(new UserImpl("AB1002", "password", 305000,
                new Address("Cynthia Drive", "3276", "3", "Bing", 13902,"user2@gmail.com")));
        listOfAccounts.add(new UserImpl("AB1003", "password", 400005,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905,"userwithtel1@hotmail.com","8714812764", "6075632765")));
        listOfAccounts.add(new UserImpl("AB1004", "password", 870000,
                new Address("Sylvia Drive", "3243", "9", "Bing", 13905,"user3@msn.com")));
        listOfAccounts.add(new UserImpl("AB1005", "password", 980000,
                new Address("Madison Drive", "289", "1", "NYC", 10005,"user4@secretary.net")));
        return listOfAccounts;
    }

    public List<UserImpl> getListOfAccounts() {
        return listOfAccounts;
    }

    public List<ManagerImpl> getListOfManagers() {
        return listOfManagers;
    }

    void start() {
        chatBotV6.start();
    }


}
