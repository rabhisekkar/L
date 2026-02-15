/*  author: @rabhisekkar
    description: count number of digits using recursion

    ex: n = 12345
    digits = 5
*/

public class CountDigits {

    public static int countDigits(int n) {
        n = Math.abs(n);  // handle negative numbers

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("number of digits: " + countDigits(n));
    }
}

// output
// number of digits: 5