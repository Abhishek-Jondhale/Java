public class Name {
    
static void name(String s1, String s2, String s3, String s4, String s5) {

        String arr[] = { s1, s2, s3, s4, s5 };
        String temp;

        System.out.println("Actual names : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((int)arr[j].charAt(0) > (int)arr[j+1].charAt(0)) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Names in Alphabtical order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String a[]) {
        String one = a[0];
        String two = a[1];
        String three = a[2];
        String four = a[3];
        String five = a[4];

       name(one, two, three, four, five);
    }

    
}