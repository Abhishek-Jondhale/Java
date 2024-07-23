public class Even {

public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 0; i <= 100; i =i+ 2) {
            sum=sum+ i;
        }
        
        System.out.println("Addition of even number in 1 to 100: " + sum);
    }
}