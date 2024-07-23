public class Area {
    float length = 300F;
    float width = 500F;
    double area;
    double amount;
    float taxPerFeet = 23.75F;

    void tax() {
        area = length * width;
        System.out.println("Total area is :" + area);
        amount = area * taxPerFeet;
        System.out.println("Total tax is:" + amount);

    }

    public static void main(String args[]) {
        Area a = new Area();
        a.tax();
    }

}
