/*  author: @rabhisekkar
    description: demonstration of multiple inheritance

    In multiple inheritance, a class can implement
    multiple interfaces and inherit their behaviors.

    Note: Java does not support multiple inheritance with classes.
    In Java, we can achieve multiple inheritance only through interfaces.
*/

public class MultipleInheritance1 {
    public static void main(String[] args) {
        Humans h = new Humans();
        h.eatPlants();
        h.eatMeat();
    }
}

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

// Interface methods are implicitly public, so their implementations must also be public,
// and the public keyword is used only on the implemented methods inside the class.

class Humans implements Herbivore, Carnivore{
    public void eatPlants(){
        System.out.println("humans eat plants");
    }
    public void eatMeat(){
        System.out.println("humans eat meat");
    }
}

// output
// humans eat plants
// humans eat meat