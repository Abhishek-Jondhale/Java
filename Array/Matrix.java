 import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number of rows ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns ");
        int columns = sc.nextInt();

        int array[][] = new int[rows][columns];

        System.out.println("Enter " + (rows * columns) + " elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered array elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

        System.out.println("Alter row here:");
        for (int i = 0; i < columns; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                System.out.print(" " + array[j][i]);
            }
            System.out.println();
        }
    }
}

 
    

