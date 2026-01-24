/*  author: @rabhisekkar
    description: demonstration of single inheritance

    Note: In single inheritance, a sub-class is derived from only one super class.
    It inherits the properties and behavior of a single-parent class.
*/

// parent / base class
class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

// child / derived class
class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks");
    }    
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();   // own method
        d.eat();    // inherited method
    }
}

// output
// Dog barks
// Animal eats