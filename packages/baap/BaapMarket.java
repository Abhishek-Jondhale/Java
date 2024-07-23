import sales.*;
import sales.Customer.*;
import sales.Order.*;

public class BaapMarket {
    public static void main(String a[]){
        System.out.println("Project  started..");
        Customer c =new Customer("Abhi","+91234567");
        Order o = new Order();
        o.setCustomer(c);
        o.addProduct("jacket");
        o.displayOrder();


    }

    
}