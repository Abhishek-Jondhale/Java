class Animal{
    String name;
    public Animal(String name){
        this.name=name;

    }
     public void makeSound(){
        System.out.println("Animal sound");
     }
     
    public static void main(String argsa []){
        Dog dog =new Dog("Buddy");
        Cat cat=new Cat("Whicker");
        dog.makeSound();
        cat.makeSound();

    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Woof!");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Meow");
    }
}