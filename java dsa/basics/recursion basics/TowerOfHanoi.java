/*  author: @rabhisekkar
    description: solve Tower of Hanoi using recursion

    you have 3 towers and n disks of different sizes which can slide onto any
    tower. The puzzle starts with disks sorted in ascending order of size
    from top to bottom (i.e., each disk sites on top of an even larger one)
    
    constraints:
    1. only one disk can be moved at a time
    2. a disk is slide off the top of one tower onto another tower
    3. a disk can't be placed on top of a smaller disk.
    program to move the disks from the first tower to the last using stacks

    Total moves = 2^n - 1
    
    TC = O(2^n)
    SC = O(n)
*/

public class TowerOfHanoi {

    public static void toh(int n, String src, String helper, String dest) {

        // base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        // step 1: move n-1 disks from src to helper using dest as auxiliary
        toh(n - 1, src, dest, helper);

        // step 2: move largest disk(nth) from src to dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // step 3: move n-1 disks from helper to destination using src as 'helper'
        toh(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, "A", "B", "C");
    }
}

// output
// Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 3 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C