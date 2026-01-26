/*  author: @rabhisekkar
    description: demonstration of hierarchical inheritance

    Note: In hierarchical inheritance,
    more than one subclass is inherited from a single base class.
*/

// parent / base class
class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

// child / derived class 1
class Cat extends Animal {
    void meow(){
        System.out.println("Cat meows");
    }
}

// child / derived class 2
class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks");
    }    
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.meow();    // cat's own method
        d.bark();   // dog's own method
        c.eat();    // inherited method from animal
        d.eat();    // inherited method from animal
    }
}

// output
// Cat meows
// Dog barks
// Animal eats
// Animal eats