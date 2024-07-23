
// import java.util.Scanner;
// public class Space {
//     public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter sentance");
//        String a=sc.nextLine();
       
       
//        String z="";
//        for(int i=0;i<a.length();i=i+2){
//        char c=a.charAt(i);
//        z=z+c;
//        }
//        System.out.println(z);
       

//     }

    
// }

import java.util.Scanner;

/**
 * Space
 */
public class Space {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String a=sc.nextLine();
        String b="";


        for(int i=0;i<a.length();i=i+2){
            char c=a.charAt(i);
            b=b+c;
        }
        System.out.println(b);

    }
}