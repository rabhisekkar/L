/*  author: @rabhisekkar
    description: demonstration of constructors and its order in abstract class

    Note: Constructor in an abstract class initializes common state
    and runs before subclass constructors during object creation.

    Constructors behave the same in abstract and normal classes,
    but abstract class constructors cannot be called directly
    because abstract classes cannot be instantiated.

*/

public class ConstructorsInAbstractClass {
    public static void main(String[] args) {
        // Animal → Horse → Mustang
        Mustang m = new Mustang();
        System.out.println(m.color);    // brown
    }
}

// abstract class
abstract class Animal {
    String color;
    // constructor
    Animal(){
        color = "brown";
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    // constructor
    Horse(){
        System.out.println("horse constructor called");
    }
}

class Mustang extends Horse{
    // constructor
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

// output
// animal constructor called
// horse constructor called
// Mustang constructor called
// brown