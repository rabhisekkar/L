// author: @rabhisekkar
// description: String input and output

// string declaration, input, output demonstration

// take input of a string and output it

import java.util.*;

public class StringInputOutput{
    public static void main(String args[]){
        // character array declaration
        // char arr[] = {'r', 's', 't', 'u'};

        // string declaration
        String str = "rstq#@1341";
        String str2 = new String("lmno#@1341");

        // string input
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");
        String name;
        name = sc.next();   //reads only first word (no whitespace or nextline)

        // above code reads only the first token and leaves the newline \n behind
        // then nextLine() below immediately reads that remaining empty newline
        // so, either use only nextLine() or clear buffer

        sc.nextLine();  //clear leftover newline

        System.out.print("enter name: ");
        String name2;
        name2 = sc.nextLine();  //reads all including nextline and whitespace

        // string output
        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
        System.out.println("name: " + name);
        System.out.println("name2: " + name2);

        sc.close();
    }
}

// output
// enter name: Abhisek Kar
// enter name: R Abhisek Kar
// str: rstq#@1341
// str2: lmno#@1341
// name: Abhisek
// name2: R Abhisek Kar