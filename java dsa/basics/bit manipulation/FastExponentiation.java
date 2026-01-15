/* author: @rabhisekkar
   description: fast exponentiation (exponentiation by squaring)

   Idea:
   - Represent exponent in binary.
   - Square the base at each step.
   - If the current bit of exponent is 1, multiply it into the answer.

   Time Complexity: O(log n)
*/

public class FastExponentiation {
    public static long fastPower(long a, long n){
        long ans = 1;
        while (n>0) {
            if((n&1) == 1){
                ans = ans * a;  // if lsb of exponent is 1
            }
            a = a*a;    // squaring base
            n = n>>1;   // right shifting or divide exponent by 2
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastPower(3, 5));
    }
}

// output
// 243