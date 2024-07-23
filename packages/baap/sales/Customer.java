package sales;

public class Customer {
    String name;
    String phoneNo;
 public   Customer (String name,String phone){
        this.name=name;
        this.phoneNo=phone;
    }
    public void displayInfo(){
        System.out.println("CustomerInfo:");
        System.out.println("Name:"+this.name);
        System.out.println("phoneNo:"+this.phoneNo);
    }
    
}
