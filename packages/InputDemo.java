import java.util.Scanner;

public class InputDemo {
    public static void main(String a[]) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = Integer.parseInt(c.nextLine());

        System.out.println("Enter Second Number");
        int num2 = Integer.parseInt(c.nextLine());

        System.out.println("Enter The Opration Name");
        String op = c.nextLine();
        if (op.equals("add")) {
            int add = num1 + num2;
            System.out.println("Addition is " + add);
        }
        if (op.equals("sub")) {
            int sub = num1 - num2;
            System.out.println("Substraction is " + sub);
        }
        if (op.equals("mul")) {
            int mul = num1 * num2;
            System.out.println("Multiplicatio is " + mul);
        }
        if (op.equals("div")) {
            int div = num1 / num2;
            System.out.println("Division is " + div);
        }
    }

}