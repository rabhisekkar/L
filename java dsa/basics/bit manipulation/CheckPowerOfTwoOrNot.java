/* author: @rabhisekkar
   description: check if a number is a power of 2 or not

    Approach: if n is a number which is power of 2, then
    n & (n-1) = 0

    ex: 8 = 1000, 7 = 0111, 1000 & 0111 = 0
    16 = 10000, 15 = 01111, 10000 & 01111 = 0
*/

public class CheckPowerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n){
        // if n=0, 0 & -1 = 0 -> it will show yes, so n>0
        return n > 0 && (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(13));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(0));
    }
}

// output
// true
// false
// true
// false