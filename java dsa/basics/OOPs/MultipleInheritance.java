/*  author: @rabhisekkar
    description: demonstration of multiple inheritance

    In Multiple inheritances, one class can have more than
    one superclass and inherit features from all parent classes.

    Note: that Java does not support multiple inheritances with classes.
    In Java, we can achieve multiple inheritances only through Interfaces.
*/

// interface 1
interface Animal {
    default void eat(){
        System.out.println("Animal eats");
    }
}

// interface 2
interface Pet {
    default void play(){
        System.out.println("Pet plays");
    }
}

// child / derived class 2
class Dog implements Animal, Pet {
    void bark(){
        System.out.println("Dog barks");
    }    
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();   // dog's own method
        d.eat();    // inherited method from animal
        d.play();   // inherited method from pet
    }
}

// output
// Dog barks
// Animal eats
// Pet plays