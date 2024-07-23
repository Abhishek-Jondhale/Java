class Table {

    void tab(int n) {
        int i ;
        for ( i = n; i <= 100; i = i + n) {
            System.out.println();
        }
        for (int j =n; j <=i; j = j+(n* 2)) {
            System.out.println(j);
        }

    }

    public static void main(String a[]) {
        System.out.println("Main method called X--X");
        String str = a[0];
        int n = Integer.parseInt(str);
        Table t = new Table();
        t.tab(n);
    }
}