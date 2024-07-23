

// public class MaxMin{

//     int arr[]={10,20,30,40,50,60,70,80,90,5};

 
//    void find(){
   
//        int a = arr.length;
//        for (int i = 0; i < a ; i++) {
//            for (int j = 0; j < a-1 ; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
   
//        System.out.println("Array in ascending order:");
//        for (int i = 0; i < a; i++) {
//            System.out.println(arr[i]);
//        }
//          int max=arr.length-1;
//          int min=arr[0];
//         System.out.println("Min No is : "+max);
//         System.out.println("Max No is : "+arr[9]);
//    }

    
//     public static void main(String args[]){
//         MaxMin min=new MaxMin();
//         min.find();
//     }
// }



class MaxMin{   
    public static void main(String[] args)
    {
        int a []={10,20,30,40,50,60,70,80,90,5};
        int minimum = a[0];
        int maximum = a[0];

    for(int i = 0; i <a.length; i++)
    {          
        if (a[i] < minimum)
        {
            minimum =a[i];
        }
        else if (a[i] > maximum)
        {
            maximum =a[i];
        } 
               
    }
    System.out.println("The minimum number is " + minimum);
    System.out.println("The maximum number is " + maximum);
    }
}

