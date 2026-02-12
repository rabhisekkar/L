/*  author: @rabhisekkar
    description: calculate sum of n natural numbers

    ex: n = 4
    sum = 1 + 2 + 3 + 4 = 10
*/

public class SumOfNNaturalNumbers {
    public static int sum (int n){
        // base case
        if (n == 1) {
            return 1;
        }

        // recursive case
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("sum of " + n + " natural numbers: " + sum(n));
    }
}

// output
// sum of 4 natural numbers: 10