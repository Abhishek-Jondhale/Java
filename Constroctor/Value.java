public class Value {
    public static void main(String a[]){
    Area ar=new Area(12);
    Squre sc=new Squre(12, 10);
    Trangle tr=new Trangle(12,4, 7);

}
}

      class Area{
        int a=0;
        Area(int r){
            this.a=r;
       float  Pi=3.14f;
       float Area=(Pi*r*2);
        System.out.println("Area of circle is : "+Area);
        }
    }
    class Squre{
        int a=0;
        int b=0;
        Squre(int l,int b){
            a=l;
            this.b=b;
            float area=(a*b);
            System.out.println("Area of ractangle is:"+area);
        }
    }
    class Trangle{
        int a=0;
        int b=0;
        int c=0;
        Trangle(int length,int brith,int width){
            a=length;
            b=brith;
            c=width;
            float area=length*brith*width;
            System.out.println("Area of trangle is:"+area);
        }
    }
    

