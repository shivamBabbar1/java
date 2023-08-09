
public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private int mobile;
    private int id;

    Person(){}

    Person(String name){
        firstName = name;
    }

    Person(String firstName, String lastName, String address, int mobile, int id){
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
      this.mobile = mobile;
      this.id = id;
    }

  public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
     public String getAddress(){
        return address;
    }
     public int getMobile(){
        return mobile;
    }
     public int getId(){
        return id;
    }

    // setter methods//
 public String setFirstName(String name){
        return firstName =name;
    }
     public String setLastName(String lname){
        return lastName = lname;
    }
     public String setAddress(String address){
        return this.address = address;
    }
     public int setetMobile(int mob){
        return mobile = mob;
    }
     public int setId(int id){
        return this.id = id;
    }
    
}
