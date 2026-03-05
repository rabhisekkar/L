/*  author: @rabhisekkar
    description: find Length of a String using Recursion

    ex: "rabhisek"
    length: 8
*/

public class StringLength {
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "rabhisek";
        System.out.println("length of the string: " + length(str));
    }
}

// output
// length of the string: 8