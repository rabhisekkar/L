/* author: @rabhisekkar
   description: clear bits in range i to j (inclusive)

    Approach:
    1. Create a mask with all 1s except bits 0 to j, which are 0.
    2. Create another mask with 1s from bit 0 to i-1.
    3. Combine both masks using bitwise OR to preserve bits outside the range i to j.
    4. Perform bitwise AND with the number to clear bits between i and j.
    
    Bit Indexing:
    - 0-based indexing (LSB = index 0)
*/

public class ClearRangeOfBits {
    public static int clearBitsInRange(int n, int i, int j){

        // Mask with 1s from bit j+1 onward
        int a = (~0) << (j+1);

        // Mask with 1s from bit 0 to i-1
        int b = (1<<i) - 1;

        // Clear bits i to j
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}

// output
// 2