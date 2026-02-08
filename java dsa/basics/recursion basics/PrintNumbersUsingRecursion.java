/*  author: @rabhisekkar
    description: print numbers in decreasing order using recursion

    Ex: 13 to 4 -> 13 12 11 10 9 8 7 6 5 4
*/

public class PrintNumbersUsingRecursion {
    public static void printDec(int a, int b){
        // base case
        if (a < b) {
            return;
        }

        // work
        System.out.print(a + " ");

        // recursive call
        printDec(a - 1, b);
    }
    public static void main(String[] args) {
        printDec(13,4);
    }
}

// output
// 13 12 11 10 9 8 7 6 5 4