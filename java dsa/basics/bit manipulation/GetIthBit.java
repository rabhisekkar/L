// author: @rabhisekkar
// description: get ith bit

// getting the ith bit of a given number
// 0-based bit indexing (LSB = bit 0)

// using, n & (1<<i)
// ex: n=10= 1010
// for i=2, 1010 & 0100 (1<<2) = 0000 ==0 -> ith bit is 0
// for i=3, 1010 & 1000 (1<<3) = 1000 !=0 -> ith bit is 1

public class GetIthBit {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) != 0){
            return 1;
        } else {    // ==0
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(getIthBit(15, 2));
        System.out.println(getIthBit(15, 4));
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
    }
}

// output
// 1
// 0
// 0
// 1