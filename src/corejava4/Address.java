package corejava4;

public class Address{

    String name;
    String doorNo;
    String streetNo;
    String locality;
    int zipcode;
    String mobile;
    String telephone;

    public Address(String name, String doorNo, String streetNo, String locality, int zipcode, String mobile, String telephone) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipcode = zipcode;
        this.mobile = mobile;
        this.telephone = telephone;
    }
    public Address(String name, String doorNo, String streetNo, String locality, int zipcode) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipcode = zipcode;
    }

    public void updateAddress(String locality){
        this.locality = locality;
    }
    public void updateAddress(String mobile, String telephone){
        this.mobile = mobile;
        this.telephone = telephone;
    }

    public void displayAddress(String name){
        System.out.printf("Name: %s\t%s, %s, %s, %s, %d\nMobile:%s\t Telephone:%s\n",name,this.name,this.doorNo,streetNo,locality,zipcode,mobile,telephone);
    }
    public void displayAddress(String name,String type,String loginName){
        System.out.printf("Account Type: %s\nLogged in with Name: %s\nName of the account: %s\n%s, %s, %s, %s, %d\nMobile:%s\t Telephone:%s\n",type,loginName,name,this.name,this.doorNo,streetNo,locality,zipcode,mobile,telephone);
    }
    @Override
    public String toString() {
        return "Name: " +name + " DoorNo: "+ doorNo + " streetNo: "+streetNo+ " locality: "+locality + " zipcode: "+ zipcode +
                " mobile: " +mobile + " telephone: "+ telephone +'\n';
    }
}