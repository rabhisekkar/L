/*  author: @rabhisekkar
    description: reverse a string using recursion

    ex: "abcd"
    output: "dcba"

    TC = O(n^2)
    SC = O(n)
*/

public class ReverseString {

    public static String reverse(String str) {

        // base case
        if (str.length() <= 1) {
            return str;
        }

        // recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "rak";
        System.out.println("reversed string: " + reverse(str));
    }
}

// output
// reversed string: kar