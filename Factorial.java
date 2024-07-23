class Factorial {
    void num1(int n) {
        long fact=1;
        for (int i = 1; i <= n; i++) {
             fact = fact * i;
            System.out.println("Factorial of given number is : " + fact);
        }
    }

    void num2(int m) {
        long fact=1;
        for (int i = 1; i <= m; i++) {
             fact = fact * i;
            System.out.println("Factorial of given number is : " + fact);
        }
    }
    public static void main(String a[]){
        String x=a[0];
        String y=a[1];
        int n=Integer.parseInt(x);
        int m=Integer.parseInt(y);
        Factorial f=new Factorial();
        f.num1(n);
        f.num2(m);
    }

}
