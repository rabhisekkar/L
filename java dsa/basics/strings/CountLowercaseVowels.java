// author: @rabhisekkar
// description: Count how many times lowercase vowels occurred
// in a String entered by the user.

// Hello World Abce -> 4 (e o o e)

import java.util.Scanner;

public class CountLowercaseVowels {
    public static int countLowerVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string.");
        String str = sc.nextLine();

        System.out.println(countLowerVowel(str));

        sc.close();
    }
}

// output
// enter a string.
// RAbhisekKar 
// 3