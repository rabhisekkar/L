/*  author: @rabhisekkar
    description: packages

    A package in Java is a mechanism to group related classes, interfaces, and sub-packages into a single unit.
*/

// declaring user defined package, we can import it in another program and use
// package mypackage;

// importing package for Scanner class
import java.util.Scanner;

class Animal{
    void eat() {
        System.out.println("eats anything");
    }
}

public class Packages {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);
        // using nextInt() function of sc obj of Scanner class
        System.out.print("enter a num: ");
        int r = sc.nextInt();
        System.out.println("r: " + r);
        sc.close();

        Animal a = new Animal();
        a.eat();
    }
}

// javac -d . Packages.java
// java mypackage.Packages

// output
// enter a num: 13
// r: 13
// eats anything