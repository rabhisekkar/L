// author: @rabhisekkar
// description: String length

// calculate length of a string

// ex:  str: "abhisek kar" strLength: 11

import java.util.*;

public class StringLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("enter your name: ");
        name = sc.nextLine();

        System.out.println("name: " + name);
        System.out.println("length of name: " + name.length());

        sc.close();
    }
}

// output
// enter your name: R Abhisek Kar
// name: R Abhisek Kar
// length of name: 13