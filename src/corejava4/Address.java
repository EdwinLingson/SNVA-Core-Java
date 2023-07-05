package corejava4;

public class Address{

    String name;
    String doorNo;
    String streetNo;
    String locality;
    int zipcode;
    String mobile;
    String email;
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
    public Address(String name, String doorNo, String streetNo, String locality, int zipcode,String email, String mobile, String telephone) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipcode = zipcode;
        this.email =email;
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
    public Address(String name, String doorNo, String streetNo, String locality, int zipcode, String email) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipcode = zipcode;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void updateAddress(String locality){
        this.locality = locality;
    }
    public void updateAddress(String mobile, String telephone){
        this.mobile = mobile;
        this.telephone = telephone;
    }

    public void displayAddress(String name){
        if(mobile!=null)
        System.out.printf("Name: %s\t%s, %s, %s, %s, %d\nMobile:%s\t Telephone:%s\temail:%s\n",name,this.name,this.doorNo,streetNo,locality,zipcode,mobile,telephone,email);
        if(mobile==null)
        System.out.printf("Name: %s\t%s, %s, %s, %s, %d email:%s\n",name,this.name,this.doorNo,streetNo,locality,zipcode,email);
    }
    public void displayAddress(){
        if(mobile!=null)
            System.out.printf("Address: %s, %s, %s, %s, %d\nMobile:%s\t Telephone:%s\temail:%s\n",this.name,this.doorNo,streetNo,locality,zipcode,mobile,telephone,email);
        if(mobile==null)
            System.out.printf("Address: %s, %s, %s, %s, %d email:%s\n",this.name,this.doorNo,streetNo,locality,zipcode,email);
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