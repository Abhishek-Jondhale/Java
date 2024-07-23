
import java.util.Arrays;

public class Matrix 
{

   static void kam()
    {
        int arr3[]={4,2};
        int arr4[]={5,9};
        int add2[]=new int [arr3.length];
        for(int i=0;i<arr3.length;i++)
        {
       add2[i]=arr3[i]+arr4[i];
        }
        System.out.println("First Addition is = "+Arrays.toString(add2));
    }
    public static void main(String[] args) 
    {
        int arr1[]={1,4};
        int arr2[]={5,2};
        int add[]=new int [arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
       add[i]=arr1[i]+arr2[i];
        }
        System.out.println("First Addition is = "+Arrays.toString(add));


       kam();

    
    }
}
