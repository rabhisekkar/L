/*  author: @rabhisekkar
    description: print binary strings of length n without consecutive 1s

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