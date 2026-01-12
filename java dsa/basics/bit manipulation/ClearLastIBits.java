// author: @rabhisekkar
// description: clear last i bit

// set last i bit to 0

// (~0) gives all 1s
// Left shift by i makes last i bits 0
// AND with n clears the last i bits

// Example: n = 15 (1111), i = 3
// ~0 or -1 = ....11111111
// bitMask = (~0) << i = ....11111000
// n & bitMask = 1111 & 1000 = 1000 = 8(dec)

public class ClearLastIBits {
    public static int clearIbits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIbits(14, 2));
        System.out.println(clearIbits(15, 3));
    }
}

// output
// 12
// 8