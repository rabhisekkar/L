/*  author: @rabhisekkar
    description: print all permutations of a string using recursion

    ex: "abc"
    output: abc, acb, bac, bca, cab, cba

    TC = O(n!)
    SC = O(n)
*/

public class PrintPermutations {

    public static void printPerm(String str, String ans) {

        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // choose each character one by one
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // remove chosen character
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // recursive call
            printPerm(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}

// output
// abc
// acb
// bac
// bca
// cab
// cba