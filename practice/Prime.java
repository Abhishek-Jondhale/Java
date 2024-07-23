import java.util.Scanner;

class Prime
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int b =Integer.parseInt(sc.nextLine());
        int x=0;
        for(int i=1; i<=b;i++){
            if(b%i==0){
             x++;
            }
        }
        if (x==2) {
            System.out.println("Given number is prime");
        } else {
             System.out.println("Given number is not prime"); 
        }
         

    }
}