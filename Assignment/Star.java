class Star {
    void main() {

        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print('*');
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Star calci = new Star();
        calci.main();
    }
}
