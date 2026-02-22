/*  author: @rabhisekkar
    description: check if a string is palindrome using recursion

    ex: "madam" -> true

    TC = O(n)
    SC = O(n)
*/

public class CheckPalindrome {

    public static boolean isPalindrome(String str, int start, int end) {

        // base case
        if (start >= end) {
            return true;
        }

        // check current characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // check remaining substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("is palindrome: " + isPalindrome(str, 0, str.length() - 1));
    }
}

// output
// is palindrome: true {