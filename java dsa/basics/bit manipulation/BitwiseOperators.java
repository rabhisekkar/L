// author: @rabhisekkar
// description: bitwise operators

public class BitwiseOperators {
    public static void main(String[] args) {
        // & (AND)
        // 1 & 1 = 1, otherwise 0
        System.out.println(5 & 6);  // 4

        // | (OR)
        // 0 | 0 = 0, otherwise 1
        System.out.println(5 | 6);  // 7

        // ^ (XOR)
        // single-bit logic: x ^ x = 0, x ^ ~x = 1
        // integer result  : x ^ ~x = all 1s (-1 in two’s complement)
        System.out.println(5 ^ 6);  // 3

        // ~ (NOT)
        // ~x = -(x + 1)
        System.out.println(~5); //-6

        // << (Left Shift)
        // x << n = x × 2ⁿ
        System.out.println(5 << 2); //20

        // >> (Right Shift)
        // x >> n = floor(x / 2ⁿ)   (for positive numbers)
        System.out.println(6 >> 1); //3
    }
}

// output
// 4
// 7
// 3
// -6
// 20
// 3