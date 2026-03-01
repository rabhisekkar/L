/*  author: @rabhisekkar
    description: solve tiling problem using recursion
    count ways to tile 2 x n board using 2 x 1 tiles

    recurrence:
    f(n) = f(n-1) + f(n-2)

    TC = O(2^n)
    SC = O(n)
*/

public class TilingProblem {

    public static int countWays(int n) {

        // base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // recursive relation
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("number of ways: " + countWays(n));
    }
}

// output
// number of ways: 5