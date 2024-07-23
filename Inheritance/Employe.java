class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String args[]) {
        FullTimeEmp f = new FullTimeEmp("Abhi", 101);
        f.emp();

        PartTimeEmp p = new PartTimeEmp("Kishor", 102);
        p.emp();
    }
}

class FullTimeEmp extends Employee {

    public FullTimeEmp(String name, int id) {
        super(name, id);
    }

    public void emp() {
        System.out.println("Name : " + name + "\nID : " + id);
        System.out.println("Full time employee salary is : 20000");
    }
}

class PartTimeEmp extends Employee {

    public PartTimeEmp(String name, int id) {
        super(name, id);
    }

    public void emp() {
        System.out.println("Name : " + name + "\nID : " + id);
        System.out.println("Part time employee salary is : 10000");
    }
}