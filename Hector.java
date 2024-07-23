class Hector 
{
    double acres = 15;
    double land;
    double en1,en2;

    void insurance() {
        land = acres / 2.5;
        if (land <= 10) 
        {
            en1 = land * 5 * 5000 / 100;
            System.out.println("Total farm in Hector : " + land);
            System.out.println("Total Insurance is : " + en1);
        }
        if (land > 10)
        {
            en2 = land * 2.5 * 5000 / 100;
            System.out.println("Total farm in Hector : " + land);
            System.out.println("Total Insurance of your farm is :" + en2);
        }
    }

     public static void main(String args[]) 
      {
        Hector farm = new Hector();
        farm.insurance();
       }

}
