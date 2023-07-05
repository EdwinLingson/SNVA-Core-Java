package coreJava12.bankTaskV7;

import coreJava8.UserImpl;

import java.util.LinkedHashMap;

public interface Manager {
    LinkedHashMap<String,PersonalUser> addPersonalUser(PersonalUser personalUser, LinkedHashMap<String,PersonalUser> listOfPersonalUserAccounts);
    LinkedHashMap<String,BussinesUser> addBussinessuser(BussinesUser bussinesUser,LinkedHashMap<String,BussinesUser> listOfBusUsers);
    void listUsers(LinkedHashMap<String,BussinesUser> busUsers,LinkedHashMap<String,PersonalUser> personalUsers);


    void updatePersonalUser(LinkedHashMap personalUsers);
    void updateBusUser(LinkedHashMap busUsers);
    LinkedHashMap<String,BussinesUser> addBussinesUser(LinkedHashMap<String,BussinesUser> busUsers);
    LinkedHashMap<String,PersonalUser> addPersonalUser(LinkedHashMap<String,PersonalUser> busUsers);

    void deletePersonalUser(LinkedHashMap<String, PersonalUser> personalUsers);

    void deleteBusUser(LinkedHashMap<String, BussinesUser> bussinessUsers);

    UserImpl searchUser(LinkedHashMap listUsers, boolean calledFromEdit);

}
