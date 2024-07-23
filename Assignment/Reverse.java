// public class Reverse {
    
//     public static void main(String b[]){
//         String a="BaapCompany";
//         String z="";
//         for(int i=10;i>=0;i--){
//             char c=a.charAt(i);
//           z=z+c;
            
//         }
//         System.out.print(z);
//     }
// }

import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter sentance");
       String a=sc.nextLine();
       
       
       String z="";
       for(int i=0;i<a.length();i=i+2){
       char c=a.charAt(i);
       z=z+c;
       }
       System.out.println(z);
       

    }

    
}