public class Mark {

    public static void main(String args[]) {

        int sum = 0;
        int Abhishek[] = { 70, 60, 80, 76 };
        for (int i = 0; i < Abhishek.length; i++) {
            sum = sum + Abhishek[i];
        }

        double mark = sum / 4;
        System.out.println("Abhishek mark is :" + mark);

        int sum_1 = 0;
        int Aditya[] = { 60, 80, 80, 76 };
        for (int i = 0; i < Aditya.length; i++) {
            sum_1 = sum_1 + Aditya[i];
        }

        double mark_1 = sum_1 / 4;
        System.out.println("Aditya mark is :" + mark_1);

        int sum_2 = 0;
        int Pankaj[] = { 90, 60, 90, 86 };
        for (int i = 0; i < Pankaj.length; i++) {
            sum_2 = sum_2 + Pankaj[i];
        }

        double mark_2 = sum_2 / 4;
        System.out.println("Pankaj mark is :" + mark_2);

        System.out.println();

        if (mark > mark_1 && mark > mark_2) {
            System.out.println("Abhishek is topper in the class: " + mark);
        }

        if (mark < mark_1 && mark_1 > mark_2) {
            System.out.println("Aditya is topper in the class: " + mark);
        }

        if (mark < mark_2 && mark_2 < mark_1) {
            System.out.println("Pankaj is topper in the class: " + mark);
        }

    }

    
}

