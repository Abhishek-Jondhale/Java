import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[2][2];
        System.out.println("Enter 4 element");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered aray element are");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                
                System.out.print(" " + array[i][j]);
            }
            System.out.println();

        }
        System.out.println("Swapping element ");
        for(int i=0;i<array.length; i++){
            for (int j =array.length-1 ; j >=0; j--) {
                System.out.print(" " +array[j][i]);
            }
            System.out.println();
        }
    }
}