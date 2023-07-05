package coreJava13.bankTask.bankTaskV7;


import java.util.LinkedHashMap;
import java.util.List;

public class Authenticate7 {
    LinkedHashMap<String, PersonalUser> listOfPersonalUserAccounts ;
    LinkedHashMap<String, BussinesUser> listOfBusAccounts ;
    public List<ManagerImpl> listOfManagers;
    public Authenticate7(LinkedHashMap<String, PersonalUser> listOfUserAccounts, LinkedHashMap<String, BussinesUser> listOfBusAccounts , List<ManagerImpl> managers){
        this.listOfManagers = managers;
        this.listOfPersonalUserAccounts = listOfUserAccounts;
        this.listOfBusAccounts = listOfBusAccounts;
    }
    public PersonalUser searchPersonalUser(String username) {
        PersonalUser user = listOfPersonalUserAccounts.get(username);
        if(user!=null) return user;
        return new PersonalUser("No User");
    }
    public BussinesUser searchBusUser(String username) {
        BussinesUser user = listOfBusAccounts.get(username);
        if(user!=null) return user;
        return new BussinesUser("No User");
    }
    public ManagerImpl searchManager(String username) {
        for (ManagerImpl manager : listOfManagers) {
            if (username.equals(manager.getUserName())) return manager;
        }
        return new ManagerImpl("No Manager");
    }
    public boolean isAuthenticated(PersonalUser user, String uname, String password){
        return user.authenticate(uname,password);
    }
    public boolean isAuthenticated(BussinesUser user, String uname, String password){
        return user.authenticate(uname,password);
    }
    public boolean isAuthenticated(ManagerImpl manager, String uname, String password){
        return manager.authenticate(uname,password);
    }
}
