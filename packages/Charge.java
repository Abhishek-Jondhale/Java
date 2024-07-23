import java.util.Scanner;

public class Charge {
    int totalCharge;
    public static void main(String a[]){
    Scanner c=new Scanner(System.in);
    System.out.println("Aqua per year charge is:");  
    int  num=Integer.parseInt(c.nextLine());
    int total=num*10;
    System.out.println("Ten year service charge is:"+total);

    }
    
}
