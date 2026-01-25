/*  author: @rabhisekkar
    description: demonstration of multilevel inheritance

    Note: In Multilevel Inheritance, a derived class will be inheriting
    a base class, which in turn is derived from another classes.
*/

// parent / base class 1
class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

// parent / base class 2
class Mammal extends Animal {
    void warmBlooded(){
        System.out.println("Mammals are warm-blooded");
    }
}

// child / derived class
class Dog extends Mammal {
    void bark(){
        System.out.println("Dog barks");
    }    
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();   // dog's own method
        d.warmBlooded();    // inherited method from mammal
        d.eat();    // inherited method from animal
    }
}

// output
// Dog barks
// Mammals are warm-blooded
// Animal eats