import java.util.*;

class Bank {

  Scanner sc = new Scanner(System.in);

  int store;
  int balance = 0;
  int store1;

  void SavingAccount() {
    System.out.println("Enter 1 for deposite");
    System.out.println("Enter 2 for withdrow");
    System.out.println("Check 3 for Balance");
    System.out.println("Enter 4 for Exit");

    int num = sc.nextInt();

    if (num == 1) {
      System.out.print("Enter deposite Ammount : ");

      int ammount = sc.nextInt();

      store = balance + ammount;

      System.out.println("Total balance is : " + store);

      SavingAccount();
    } else if (num == 2) {
      if (store > 500) {
        System.out.print("Enter withdrow ammount : ");

        int ammount = sc.nextInt();

        store1 = store - ammount;

        if (0 < store1) {
          System.out.println("Total balance is : " + store1);
        } else {
          System.out.println("balance is not sufficient");
        }

        SavingAccount();
      } else {
        System.out.println("your not access");
      }
    } else if (num == 3) {
      System.out.println("Total balance is : " + store1);

      SavingAccount();
    } else if (num == 4) {
      System.out.println("your Exit");
    }
  }

  public static void main(String args[]) {
    Bank obj = new Bank();

    obj.SavingAccount();
  }
}
