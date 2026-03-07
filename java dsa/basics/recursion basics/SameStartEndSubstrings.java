/*  author: @rabhisekkar
    description: count all contiguous substrings that start and end with the same character

    example:
    s = "aba"

    valid substrings:
    a, b, a, aba

    total = 4

    TC = O(2^n)
    SC = O(n)
*/

public class SameStartEndSubstrings {

    // length based approach
    public static int countSubstrs(String str, int i, int j, int n) {

        // base cases
        if (n <= 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        // recursive counts
        int res = countSubstrs(str, i + 1, j, n - 1)
                + countSubstrs(str, i, j - 1, n - 1)
                - countSubstrs(str, i + 1, j - 1, n - 2);
        
        // if first and last characters match
        if (str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }

    // index based approach
    public static int countSubstr(String s, int i, int j) {

        // base cases
        if (i > j) {
            return 0;
        }

        if (i == j) {
            return 1;
        }

        // recursive count
        int res = countSubstr(s, i + 1, j)
                + countSubstr(s, i, j - 1)
                - countSubstr(s, i + 1, j - 1);

        // check if first and last characters match
        if (s.charAt(i) == s.charAt(j)) {
            res += 1;
        }

        return res;
    }

    public static void main(String[] args) {

        String s = "aba";
        int n = s.length();

        System.out.println(
            "total substrings(length based result): "
            + countSubstrs(s, 0, n - 1,n)
        );

        System.out.println(
            "total substrings(index based result): "
            + countSubstr(s, 0, n - 1)
        );
    }
}

// output
// total substrings(length based result): 4
// total substrings(index based result): 4