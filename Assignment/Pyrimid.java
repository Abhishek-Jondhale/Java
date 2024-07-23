// class Pyrimid{
//     public static void main(String[] args) {
        
//         int i,n,j,k;
//         n=5;
//         for(i=1;i<=n;i++){
//             for(k=1;k<=(n-i);k++){
//                 System.out.print(" ");
    
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(j=2;j<=i;j++){
//                System.out.print("*");
//             }
//             System.out.println("");
//         }
//         }

//  }
public class Pyrimid {

  public static void main(String[] args) {
    int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        k++;
      }

      System.out.println();
    }
  }
}