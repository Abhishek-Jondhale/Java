import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter sentance");
       String a=sc.nextLine();
       
       
       String z="";
       for(int i=a.length()-1;i>=0;i--){
       char c=a.charAt(i);
       z=z+c;
       System.out.print(c);
       }
       
    }

}