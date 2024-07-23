public class Single {

    void name() {
        System.out.println("Name of the Student:");
    }
}

class Inheritance extends Single {
    void disp() {
        System.out.println("Abhishek");
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.name();
        obj.disp();
    }
}
