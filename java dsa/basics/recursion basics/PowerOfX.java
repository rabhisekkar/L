/*  author: @rabhisekkar
    description: calculate x to the power n using recursion

    ex: x = 2, n = 4
    output: 16

    TC = O(n)
    SC = O(n)
*/

public class PowerOfX {

    public static int power(int x, int n) {

        // base case
        if (n == 0) {
            return 1;
        }

        // recursive case
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println("result: " + power(x, n));
    }
}

// output
// result: 16