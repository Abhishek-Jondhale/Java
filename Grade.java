import javax.sound.sampled.SourceDataLine;

public class Grade {
   int mar = 70;
   int eng = 70;
   int math = 55;
   int phy = 57;
   int bio = 48;
   int chem = 70;
   float per;
   int total;

   void percentage()

   {
      total = mar + math + eng + bio + chem + phy;
      per = total / 6;
      System.out.println("total mark:" + total);
      System.out.println("percentage :" + per);

      if (per < 35) {
         System.out.println("student is fail");
      }
      if (per > 35 && per < 60) {
         System.out.println("first class");
      }
      if (per >= 60 && per <= 90) {
         System.out.println("first class");
      }
   }

   public static void main(String args[]) {
      Grade g = new Grade();
      g.percentage();
   }
}
