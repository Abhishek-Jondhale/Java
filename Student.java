class Student
{
  int eng=70;
  int mar=70;
  int phy=54;
  int math=56;
  int bio=70;
  int chem=60;
  float per;
  int total;
void percentage()  
{
 total=eng+math+mar+phy+bio+chem;
 per=total/6;
 System.out.println("Total mark is:"+total);
 
 System.out.println("percentage are :"+per);
 }
 public static void main(String args[])
{ 
 System.out.println("result of student");
 Student result= new Student();
 result.percentage();

 }
}
