/*  author: @rabhisekkar
    description: demonstration of abstract class

    Note: In Java, an abstract class is a class that cannot be
    instantiated and is designed to be extended by other classes.
*/


public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Peacock p = new Peacock();
        p.eat();
        p.walk();

        // error: Cannot instantiate the type Animal
        // Animal a = new Animal();
    }
}

// abstract class
abstract class Animal {
    // non-abstract method
    void eat(){
        System.out.println("animal eats");
    }

    // abstract method
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Peacock extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

// output
// animal eats
// Walks on 4 legs
// animal eats
// walks on 2 legs