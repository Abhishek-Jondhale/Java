public class Interest {
      long amount=1500000;
      double intrest;
      double totalAmount;
      
   void loan()   
   {
    intrest=amount*11/100;
    totalAmount=intrest*20;
    System.out.println("total interest in one year:"+intrest);
    System.out.println("total interest in 20 year:"+totalAmount);
   }
   public static void main(String args[]){

   
   Interest income = new Interest();
   income.loan();
   }
}
