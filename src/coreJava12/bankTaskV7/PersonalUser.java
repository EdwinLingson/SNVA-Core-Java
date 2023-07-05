package coreJava12.bankTaskV7;

import coreJava8.UserImpl;
import corejava4.Address;

public class PersonalUser extends UserImpl {
    public PersonalUser(String userName, String password, int balance, Address address) {
        super(userName, password, balance, address);
    }

    public PersonalUser(String userName) {
        super(userName);
    }
}
