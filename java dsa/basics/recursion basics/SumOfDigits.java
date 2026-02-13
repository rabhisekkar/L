/*  author: @rabhisekkar
    description: calculate sum of digits using recursion

    ex: n = 1234
    sum = 1 + 2 + 3 + 4 = 10
*/

public class SumOfDigits {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("sum of digits: " + sumDigits(n));
    }
}

// output
// sum of digits: 10
