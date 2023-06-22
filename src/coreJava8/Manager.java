package coreJava8;

class Manager extends Person {
    public Manager(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean authenticate(String uname, String password) {
        return false;
    }
}
