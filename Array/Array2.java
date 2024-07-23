import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[2][2];
        int array2[][] = new int[2][2];
        int array3[][] = new int[2][2];
        System.out.println("Enter array 1 element");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array 2 element");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of Array1 and Array2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array3[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition is");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(" " + array3[i][j]);
            }
            System.out.println();
        }
    }
}
