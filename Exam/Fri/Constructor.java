public class Constructor {
    public static void main(String a[]){
     Area c=new Area(6);
     Area d=new Area(20,40);
     Area e=new Area(12,13,14);

    }
}
 class Area{
    int m=0;
    int n=0;
    int x=0;
    int a=0;
    int c=0;
    Area(int r){
        this.m=r;
   float  Pi=3.14f;
   float Area=(Pi*r*2);
    System.out.println("Area of circle is : "+Area);
    }

    Area(int a,int b){
        this.m=a;
        this.n=b;
        float Area=(a*b);
        System.out.println("Area of ractangle is:"+Area);


    }
   Area(int a, int b, int c){
    this.a=a;
    this.x=b;
    this.c=c;
    float Area=(a*b*c);
        System.out.println("Area of trangle is:"+Area);


   }


}

