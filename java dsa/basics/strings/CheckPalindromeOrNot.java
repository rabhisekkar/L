// author: @rabhisekkar
// description: check if a string is a palindrome

// palindrome reads the same backwards as forwards
// ex: racecar, madam, nun

public class CheckPalindromeOrNot{
    //checking palindrome or not
    public static void isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
        return;
    }
    public static void main(String args[]){
        String str = "R Abhisek Kar";
        System.out.println("str: " + str);
        isPalindrome(str);

        String str1 = "racecar";
        System.out.println("str1: " + str1);
        isPalindrome(str1);
    }
}

// output
// str: R Abhisek Kar
// not palindrome
// str1: racecar
// palindrome

// tc = O(n)