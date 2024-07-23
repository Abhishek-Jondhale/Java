abstract class Animal{
    abstract void Name();

}
class Cat extends Animal{
    void Name(){
        System.out.println("This is cat");
    }
}
class Dog extends Animal{
    void Name(){
        System.out.println("This is dog");
    }

}
 class Main{
    public static void main(String args[]){
        Animal obj=new Cat();
        obj.Name();
    }

}