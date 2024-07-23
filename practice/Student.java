public class Student {
    public static void main(String[] args) {
        int[] marks = {76, 67, 78, 90, 100};

        int sum = 0;
        int length = marks.length;
        int max = marks[0]; 
        int min = marks[0]; 

        for (int mark : marks) {
            sum += mark;

            
            if (mark > max) {
                max = mark;
            }

            
            if (mark < min) {
                min = mark;
            }
        }
        
        float avg=sum/length;

        System.out.println("Avrage is :"+avg);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Length of the array : " + length);
        System.out.println("Maximum mark in the array: " + max);
        System.out.println("Minimum mark in the array: " + min);
    }

}
 