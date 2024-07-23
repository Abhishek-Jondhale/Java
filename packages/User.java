// import java.util.*;

// public class User {
//     public static void main(String a[10]){
//         Scanner c=new Scanner(System.in);
//         System.out.println("Enter Ten students name");
//         String name="";
//         String arr[];
//         String stu1 =(c.nextLine());
//         String stu2 =(c.nextLine());
//         String stu3 =(c.nextLine());
//         String stu4 =(c.nextLine());
//         String stu5 =(c.nextLine());
//         String stu6 =(c.nextLine());
//         String stu7 =(c.nextLine());
//         String stu8 =(c.nextLine());
//         String stu9 =(c.nextLine());
//         String stu10 =(c.nextLine());
//         String total[]={stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9,stu10};
//         String n=Arrays.toString(total);

        


        
//             System.out.println();
        
       
        

//      }
// }
import java.util.*;
public class User {

     static void studentsName()
        {
        String[] names = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten names : ");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();

        }
        for (int j = 0; j < names.length; j++) {
            
            System.out.print("\t" + names[j].toUpperCase());
        } 
        }
    public static void main(String[] args)
    {
       studentsName();
    }
}


