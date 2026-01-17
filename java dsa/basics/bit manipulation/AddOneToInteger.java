/*  author: @rabhisekkar
    description: add 1 to an integer using bit manipulation

    Method 1: use XOR and AND
    Method 2: use -~x
    -x = ~x + 1 so, -~x = x + 1 (by replacing x by ~x)
*/

public class AddOneToInteger {
    // Method 1: Using XOR and AND
    public static int addOne(int x){
        int i = 1;
        while((x & i) != 0){
            x = x ^ i;  // flip 1 → 0
            i = i << 1; // move carry
        }
        x = x ^ i;  // flip first 0 → 1
        return x;
    }
    // Method 2: using -~x
    public static int addOne1(int x) {
        x = -~x;
        return x;
    }
    public static void main(String[] args) {
        System.out.println(addOne(12));
        System.out.println(addOne1(40));
    }
}

// output
// 13
// 41