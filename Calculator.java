public class Calculator {
    int length;
    int width;
    int area;

    static float taxrate = 23.75f;
    float totalTax;

    int CalculateArea() {
        int temparea = length * width;
        return temparea;
    }

    float calculateTax() {
        return area * taxrate;

    }

    public static void main(String args[]) {
        System.out.println("Program has started...");

        Calculator sham = new Calculator();
        Calculator adi = new Calculator();

        System.out.println(sham.length);
        System.out.println(adi.length);
        sham.length=300;
        sham.width=200;

        sham.area=sham.CalculateArea();
        sham.totalTax=adi.calculateTax();
        System.out.println(sham.totalTax);
        

    }

}
