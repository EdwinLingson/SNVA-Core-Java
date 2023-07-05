package coreJava13.bankTask.bankTaskV7;

import coreJava8.UserImpl;
import corejava4.Address;

public class BussinesUser extends UserImpl {


    public BussinesUser(String userName, String password, int balance, Address address) {
        super(userName, password, balance, address);
    }

    public BussinesUser(String userName) {
        super(userName);
    }

    @Override
    public boolean authenticate(String uname, String pwd) {
        return uname.equals(getUserName()) && getPassword().equals(pwd);
    }
}
