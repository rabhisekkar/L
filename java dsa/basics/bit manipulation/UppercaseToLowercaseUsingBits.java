/*  author: @rabhisekkar
    description: convert uppercase characters to lowercase using bits

    ASCII trick:
    Uppercase and lowercase letters differ only by bit 5
    (0-based indexing from LSB, value = 32).

    'A' = 65 = 01000001
    'a' = 97 = 01100001

    Uppercase → lowercase:
    ch | ' '   // sets bit 5 (' ' = 32 = 00100000)

    Lowercase → uppercase:
    ch & '_'   // clears bit 5 ('_' = 95 = 01011111)

    Note: Works only for ASCII letters.
*/

public class UppercaseToLowercaseUsingBits {
    public static void main(String[] args) {
        // convert uppercase characters to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++){
            // prints lowercase letters a–z using ASCII bit manipulation
            System.out.print((char)(ch | ' '));
        }
    }
}

// output
// abcdefghijklmnopqrstuvwxyz