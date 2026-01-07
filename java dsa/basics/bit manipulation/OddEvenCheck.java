// author: @rabhisekkar
// description: check odd or even using bit-wise operators

// lsb of odd nums are 1. so,
// (oddNum) xxx1 & 0001 == 1
// (evenNum) xxx0 & 0001 == 0

public class OddEvenCheck {
    public static void oddOrEven(int n){
        if((n & 1) !=0 ){   // ==1
            System.out.println("odd");
        } else {    // (n & bitMask) == 0
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        oddOrEven(4);
        oddOrEven(13);
        oddOrEven(-41);
    }
}

// output
// even
// odd
// odd