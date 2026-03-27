/*  author: @rabhisekkar
    description: find and print all permutations of a given string

    ex:
    Input: "abc"
    Output: abc, acb, bac, bca, cab, cba

    if string length = n, then total no of permutations = n!

    TC = O(n * n!)   // n! permutations, each takes O(n) time (string creation)
    SC = O(n)        // recursion depth
*/

public class FindPermutations {
    public static void findPermutations(String str, String ans){
        // base case: when string becomes empty
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // loop through all characters
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);

            // remove current character from string
            // ex: "abcde" => "ab" + "de" = "abde" -> c removed
            String newStr = str.substring(0, i) + str.substring(i + 1);
            
            // recursive call
            findPermutations(newStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}

// output
// abc
// acb
// bac
// bca
// cab
// cba