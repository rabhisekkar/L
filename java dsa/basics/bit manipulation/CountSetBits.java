/* author: @rabhisekkar
   description: count set bits

   count number of set bits(no of 1's present) in the number
   ex: 10 = 1010 -> setBits=2

   note: subtracting 1 flips the lowest set bit, so AND removes it.
   n & (n - 1) removes the lowest set bit (rightmost 1) of n
*/

public class CountSetBits {
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            // checking lsb
            if((n & 1) != 0){
                count++;
            }
            // right shifting the original number
            n >>= 1;
        }
        return count;
    }
    //optimized / Brian Kernighan
    public static int countSetBits1(int n){
        int count = 0;
        while(n>0){
            // n & (n - 1) removes the lowest set bit (rightmost 1) of n
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(15));
        System.out.println(countSetBits1(16));
        System.out.println(countSetBits1(13));
    }
}

// output
// 2
// 4
// 1
// 3