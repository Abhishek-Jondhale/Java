package sales;

public class Order {
    int orderNo;
    Customer customer;
    String productList[];
    public void setCustomer(Customer c){
        this.customer=c;
    }
      public void addProduct(String name){
         productList[0]=name;
     }
    public void displayOrder(){
        System.out.println("Order info");
        System.out.println("Customer");
        customer.displayInfo();
        System.out.println("Product"+productList);

    }
    
}
