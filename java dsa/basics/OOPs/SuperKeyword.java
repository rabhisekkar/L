/*  author: @rabhisekkar
    description: super keyword

    The super keyword in Java is used to refer to the immediate
    parent class object in an inheritance hierarchy.
*/

public class SuperKeyword {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Human extends Animal {
    Human() {
        // super() must be the first statement in a subclass constructor.
        // If no superclass constructor is explicitly called, Java
        // automatically inserts a call to the no-argument constructor.
        super();    // if we remove this line the output will be same
        // because java automatically do it
        super.color = "brown";
        System.out.println("human constructor is called");
    }
}

// output
// animal constructor is called
// human constructor is called
// brown