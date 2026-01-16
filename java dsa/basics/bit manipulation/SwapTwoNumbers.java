/* author: @rabhisekkar
   description: Swap two numbers without using any third variable

   Note: use XOR operator (^)
   XOR swap fails if both variables refer to the same memory location.
*/

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 13;
        int y = 41;
        System.out.println("before swap: x = " + x + ", y = " + y);

        // xor swap
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("after swap: x = " + x + ", y = " + y);
    }
}

// output
// before swap: x = 13, y = 41
// after swap: x = 41, y = 13