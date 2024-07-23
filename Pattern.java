class Pattern {

    void star(int l) {
        for (int i =1; i <= l; i++) {
            if (i %2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("$");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    
    }
    public static void main(String a[]) {
        String str = a[0];
        int l = Integer.parseInt(str);
        Pattern m = new Pattern();
        m.star(l);
    }
}
