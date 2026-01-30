/*  author: @rabhisekkar
    description: method overriding / run time polymorphism

    method overriding: A child class can redefine a method of its parent class.
*/

class Animal{
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    // overriding the parent eat()
    void eat() {
        System.out.println("eats grass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// output
// eats grass