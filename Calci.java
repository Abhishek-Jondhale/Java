public class Calci {
  void addi(int x, int y) {
    int addi = x + y;
    System.out.println("Addition is:" + addi);
  }

  void sub(int x, int y) {
    int sub = x - y;
    System.out.println("Substration is:" + sub);
  }

  void mul(int x, int y) {
    int mul = x * y;
    System.out.println("Multiplication is:" + mul);
  }

  void div(int x, int y) {
    int div = x / y;
    System.out.println("Divison is:" + div);
  }

  public static void main(String a[]) {
    String str1 = a[0];
    String str2 = a[1];

    int num1 = Integer.parseInt(str1);
    
    int num2 = Integer.parseInt(str2);

    Calci cal = new Calci();
    cal.addi(num1, num2);
    cal.sub(num1, num2);
    cal.mul(num1, num2);
    cal.div(num1, num2);

  }
}
