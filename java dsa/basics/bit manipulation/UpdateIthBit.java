// author: @rabhisekkar
// description: update ith bit

// update ith bit of a number, to given newBit(o,1)

// Example: n = 10 (1010), i = 2, newBit = 1
// clear step  : ith bit forced to 0
// set step    : ith bit set to newBit
// result = 14 (1110)

public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit){
        n = n & ~(1 << i);  //clear ith bit
        n = n | (newBit << i);  // set ith bit to newBit
        return n;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}

// output
// 14