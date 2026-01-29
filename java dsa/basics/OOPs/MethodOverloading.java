/*  author: @rabhisekkar
    description: method overloading / compile time polymorphism

    method overloading: multiple methods with the same name but different parameters.
*/

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1, 2)); // calls sum(int, int)
        System.out.println(calc.sum(1.1f,2.1f));    // calls sum(float, float)
        System.out.println(calc.sum(1, 2, 3));  // calls sum(int, int, int)
    }
}

// output
// 3
// 3.1999998
// 6