/*  author: @rabhisekkar
    description: print numbers in increasing order using recursion

    Ex: 4 to 13 -> 4 5 6 7 8 9 10 11 12 13
*/

public class PrintNumbersInIncreasingUsingRecursion {
    public static void printAsc(int a, int b){
        // base case
        if (a > b) {
            return;
        }

        // work
        System.out.print(a + " ");

        // recursive call
        printAsc(a + 1, b);
    }
    public static void main(String[] args) {
        printAsc(4,13);
    }
}

// output
// 4 5 6 7 8 9 10 11 12 13