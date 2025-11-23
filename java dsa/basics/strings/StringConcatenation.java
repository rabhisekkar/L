// author: @rabhisekkar
// description: String concatenation

// string concatenation demonstration

public class StringConcatenation{
    public static void main(String args[]){

        String firstName = "Abhisek";
        String lastName = "Kar";

        //concatenation
        String fullName = firstName + " " + lastName;
        String fullName1 = "R " + firstName + " " + lastName;

        //here also whan we output something we use concatenation
        System.out.println("fullName: " + fullName);
        System.out.println("fullName1: " + fullName1);
    }
}

// output
// fullName: Abhisek Kar
// fullName1: R Abhisek Kar