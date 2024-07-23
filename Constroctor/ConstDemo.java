import java.util.*;

public class ConstDemo {
    public static void main(String []a){
        // Student sam=new Student();
        Student geeta=new Student(29,48);
        Student isha=new Student(88,93);



    }
    
}
class Student{
    int HSC;
    int ssc;
    boolean isEligible()
    {
     if(ssc >60 && HSC>60){
        return true;

     }
     else
     {
        return false;
     }
    }
    // Student()
    // {
    //     System.out.println("Empty constroctor is called");
    // }

    Student(int ssc, int hsc)
    {
      System.out.println("Student is created");
       HSC=hsc;
      this.ssc=ssc;
      boolean eligible=isEligible();
      
      if(eligible==true){
        System.out.println("Student is eligible");
      }
      else
      {
        System.out.println("Student is not eligible");
      }
      // HSC=hsc;
      // this.ssc=ssc;


    }
}
