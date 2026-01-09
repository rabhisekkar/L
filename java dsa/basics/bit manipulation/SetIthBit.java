// author: @rabhisekkar
// description: set ith bit

// set the ith bit of a given number, set the bit to 1
// Note: using, n | (1<<i), because x | 1 = 1
// OR with 1 sets ith bit, OR with 0 keeps other bits unchanged

// ex: n=10= 1010, for i=2(ith bit is 0)
// 1010 | 0100 (1<<2) = 1110 -> ith bit is set to 1

public class SetIthBit {
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        n = n | bitMask;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
        System.out.println(setIthBit(3, 3));
    }
}

// output
// 14
// 11