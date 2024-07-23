public class Animal {
    void dog() {
        System.out.println("Dog is barking");
    }
}

class Animal2 extends Animal {
    void cat() {
        System.out.println("Cat is meowing");
    }
}

class Animal3 extends Animal {
    void taras() {
        System.out.println("Taras is ------ ");
    }
}

class Hierarchical extends Animal {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        animal2.cat();

        Animal3 animal3 = new Animal3();
        animal3.taras();

        Hierarchical hierarchical = new Hierarchical();
        hierarchical.dog();
    }
}
