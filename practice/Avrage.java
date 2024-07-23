
// write a java program to calculate avarage marks in a
// class ,handle exception of valid input and array index of boundry

import java.util.Scanner;

class Avrage {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Student name:");
        String Student1 = sc.nextLine();

        System.out.println("Enter math Subject Marks: ");
        int math = sc.nextInt();
        System.out.println("Enter physics Subject Marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter chem Subject Marks: ");
        int chem = sc.nextInt();
        System.out.println("Enter bio Subject Marks: ");
        int bio = sc.nextInt();
        System.out.println("Enter eng Subject Marks: ");
        int eng = sc.nextInt();

        float total = math + physics + chem + bio + eng;
        System.out.println("Total mark is :" + total);
        float per = total / 5;
        System.out.println("percentage of mark is:" + per);

        System.out.println("Enter Second Student name:");
        String Student2 = sc.nextLine();

        System.out.println("Enter math Subject Marks: ");
        int math1 = sc.nextInt();
        System.out.println("Enter physics Subject Marks: ");
        int physics1 = sc.nextInt();
        System.out.println("Enter chem Subject Marks: ");
        int chem1 = sc.nextInt();
        System.out.println("Enter bio Subject Marks: ");
        int bio1 = sc.nextInt();
        System.out.println("Enter eng Subject Marks: ");
        int eng1 = sc.nextInt();

        float all = math1 + physics1 + chem1 + bio1 + eng1;
        System.out.println("Total mark is :" + all);
        float perce = all / 5;
        System.out.println("percentage of mark is:" + perce);

        if (total > all) {
            System.out.println(Student1 + "  is higest mark");
        } else {
            System.out.println(Student2 + "second  student is higest mark");
        }

    }

}