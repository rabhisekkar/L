/*  author: @rabhisekkar
    description: find and print all subsets of a given string

    ex:
    Input: "abc"
    Output: a, b, c, ab, ac, bc, abc, ""

    if string length = n, then total no of subsets = 2^n

    TC = O(n * 2^n)
    SC = O(n)
*/

public class FindSubsets {

    public static void findSubsets(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // include current character
        findSubsets(str, ans + str.charAt(i), i + 1);

        // exclude current character
        findSubsets(str, ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
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
// null