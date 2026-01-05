// author: @rabhisekkar
// description: Determine if 2 strings are anagrams of each other

// If two string contain the same characters but in a different order,
// they can be said to be anagrams.
// ex: "race" and "care"

// "earth" "heart" -> anagram

import java.util.Arrays;

public class CheckStringAnagrams {
    public static boolean checkAnagrams(String str1, String str2){
        // if the lengths are not same, then not anagrams
        if(str1.length() != str2.length()){
            return false;
        }
        
        //convert strings into char array
        char[] str1CharArr = str1.toCharArray();
        char[] str2CharArr = str2.toCharArray();

        //sort those array
        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);
        
        // check if the sorted char arrays are same
        // then the strings are anagram
        return Arrays.equals(str1CharArr, str2CharArr);
    }
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        if(checkAnagrams(str1, str2)){
            System.out.println("anagrams");
        } else {
            System.out.println("not anamrams");
        }
    }
}

// output
// anagrams