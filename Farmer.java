import java.utile.Scanner
class Farmer {
    public static void main(String[] args) {
        int[][] array=new int[2][3];
        scanner sc=new scanner(System.in);
        System.out.println("enter array :");
        for(int i=0; i<=array.length;i++){
            for(int j=0;j<array.length;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter array :");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.println(" "+array[i][j]);
            }
            System.out.println();
        }
    }
}