/*  author: @rabhisekkar
    description: print all subsequences of a string using recursion

    ex: "abc"
    output: abc, ab, ac, a, bc, b, c, ""

    TC = O(2^n)
    SC = O(n)
*/

public class PrintSubsequences {

    public static void printSubseq(String str, int i, String current) {

        // base case
        if (i == str.length()) {
            System.out.println(current);
            return;
        }

        // include current character
        printSubseq(str, i + 1, current + str.charAt(i));

        // exclude current character
        printSubseq(str, i + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str, 0, "");
    }
}

// output
// abc
// ab
// ac
// a
// bc
// b
// c
//  