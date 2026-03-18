/*  author: @rabhisekkar
    description: print binary strings of length n without consecutive 1s

    ex: n = 3
    valid strings:
    000
    001
    010
    100
    101

    invalid strings: (consecutive 1s)
    011  (two 1s together)
    110
    111

    TC = O(2^n)
    SC = O(n)
*/

public class BinaryStrings {

    public static void printBinStrings(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // place 0
        printBinStrings(n - 1, 0, str + "0");

        // place 1 only if last digit was 0
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBinStrings(n, 0, "");
    }
}

// output
// 000
// 001
// 010
// 100
// 101