/*  author: @rabhisekkar
    description: calculate factorial of a number using recursion

    ex: n = 4
    n! = 4! = 4 * 3 * 2 * 1 = 24

    tc = O(n)
    sc = O(n)
*/

public class FindFactorial {
    public static int findFact(int n){
        // base case
        if (n == 0) {
            return 1;
        }

        // recursive case
        return n * findFact(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial of " + n + " is: " + findFact(n));
    }
}

// output
// factorial of 4 is: 24