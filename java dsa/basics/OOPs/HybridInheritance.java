/*  author: @rabhisekkar
    description: demonstration of hybrid inheritance

    Note: It is a mix of two or more of other types of inheritance.
*/

// parent / base class
class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

// child / derived class
class Mammal extends Animal {
    void warmBlooded() {
        System.out.println("Mammals are warm-blooded");
    }
}

// interface
interface Pet {
    default void play() {
        System.out.println("Pet plays");
    }
}

// child / derived class (hybrid inheritance)
class Dog extends Mammal implements Pet {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();        // own method
        d.warmBlooded(); // from Mammal
        d.eat();         // from Animal
        d.play();        // from interface Pet
    }
}

// output
// Dog barks
// Mammals are warm-blooded
// Animal eats
// Pet plays