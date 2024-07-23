import java.util.*;

class Student{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name : ");
        String name=sc.nextLine();


        Scanner s = new Scanner(System.in);
        System.out.println("Enter hindi sub marks : ");
        int hindi=s.nextInt();
         System.out.println("Enter biology sub marks : ");
        int bio=s.nextInt();
         System.out.println("Enter english sub marks : ");
        int eng=s.nextInt();
         System.out.println("Enter math sub marks : ");
        int math=s.nextInt();
         System.out.println("Enter physics sub marks : ");
        int phy=s.nextInt();
         System.out.println("Enter chemistry sub marks : ");
        int chem=s.nextInt();
        

        int total=hindi+bio+eng+phy+chem;
        System.out.println("Total mark is:"+total);


        int percentage=total/6;
        System.out.println("percentage are:"+percentage);

if(percentage >75 && percentage<=100)
{
System.out.println("Student is in First class");
}
else if(percentage >55 && percentage <=75)
{
System.out.println("Student is in Second  class");
}
else if(percentage >=35 && percentage <=55)
{
System.out.println("Student is in pass  class");
}
else{
System.out.println("Student is in Fail");
}

    }
    
}