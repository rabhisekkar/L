/*  author: @rabhisekkar
    description: demonstration of inheritance

    Note: Inheritance is when properties & methods of base class
    are passed on to a derived class
    sn: 24
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

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();   // own method
        d.eat();    // inherited method
    }
}

// output
// Dog barks
// Animal eats