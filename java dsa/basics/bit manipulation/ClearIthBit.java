// author: @rabhisekkar
// description: clear ith bit

// clear the ith bit of a given number, clear the bit to 0
// Note: using, n & ~(1<<i)

// ex: n=10(dec) = 1010, for i=1(ith bit is 1)
// 1010 & 1101 (~(1<<1)) = 1000 = 8(dec) -> ith bit is clear to 0

public class ClearIthBit {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        n = n & bitMask;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}

// output
// 8