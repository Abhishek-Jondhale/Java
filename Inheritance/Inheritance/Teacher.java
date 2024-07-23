
public class Teacher {
    void a() {
        System.out.println("This is a teacher class");
    }
}

class Student extends Teacher {
    void b() {
        System.out.println("This is a student class");
    }
}

class Student2 extends Teacher {
    void c() {
        System.out.println("This is a Student2 class");
    }
}

public class Multilevel extends Student2 {
    public static void main(String args[]) {
        Multilevel multilevel = new Multilevel();
        multilevel.a();
        multilevel.b();
        multilevel.c();
    }
}
