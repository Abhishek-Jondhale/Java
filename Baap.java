class Baap {
  void action() {
    String a = "baapCompany";
    for (int b = 0; b <= 11; b++) {

      for (int z = 0; z < b; z++) {
        char c = a.charAt(z);
        System.out.print(c);
      }
      System.out.println("");

    }

  }

  public static void main(String a[]) {
    Baap show = new Baap();
    show.action();
  }
}