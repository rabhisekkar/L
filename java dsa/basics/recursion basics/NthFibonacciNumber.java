/*  author: @rabhisekkar
    description: print nth fibonacci number

    The Fibonacci series is an infinite sequence of numbers starting with
    0 and 1, where each subsequent number is the sum of the previous two.

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

    TC = O(2^n)
    SC = O(n)
*/

public class NthFibonacciNumber {

    public static int findFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return findFib(n-1) + findFib(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("fibonacci of " + n + " is: " + findFib(n));
    }
}

// output
// fibonacci of 4 is: 3