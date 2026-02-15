/*  author: @rabhisekkar
    description: print first n Fibonacci numbers

    The Fibonacci series is an infinite sequence of numbers starting with
    0 and 1, where each subsequent number is the sum of the previous two.

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
*/

public class PrintFibonacciSeries {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void printSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printSeries(n);
    }
}

// output
// 0 1 1 2