/*  author: @rabhisekkar
    description: calculate x to the power n using optimized recursion

    ex: x = 2, n = 5
    output: 32

    TC = O(log n)
    SC = O(log n)
*/

public class FastPower {

    public static int power(int x, int n) {

        // base case
        if (n == 0) {
            return 1;
        }

        // divide step
        int halfPower = power(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // if n is odd
        if (n % 2 != 0) {
            return x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println("result: " + power(x, n));
    }
}

// output
// result: 32