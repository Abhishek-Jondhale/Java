public class Animal1 {

    void eat() {
        System.out.println("Animal is eating ");
    }

   

}
class Dog extends Animal1 {
    void bark() {
        System.out.println("dog is barking");
    }



    public static void main(String args[]) {
        Dog d =new Dog();
        d.eat();
    
        d.bark();

    }
}



