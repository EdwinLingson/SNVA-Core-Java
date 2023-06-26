package coreJava8;

abstract class Person implements Authenticate {
    private String userName;
    private String password;

    public Person(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Person(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
