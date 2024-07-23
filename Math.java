class Math
{
 int num1=50;
 int num2=20;
 int ans;

void addition()
{
 ans=num1+num2;
 System.out.println("Addition is:"+ans);

}
 public static void main(String args[])
{
 System.out.println("I am in main method");
 Math mycalci= new Math();
 mycalci.num1=60;
 mycalci.num2=90;
 mycalci.addition();
 
Math calci=new Math();
calci.addition();
}

}