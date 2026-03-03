/*  author: @rabhisekkar
    description: solve friends pairing problem using recursion

    Given n friends, each can stay single or pair with another friend.
    Each friend can be paired only once. Find the total number of possible ways.

    recurrence:
    f(n) = f(n-1) + (n-1) * f(n-2)

    TC = O(2^n)
    SC = O(n)
*/

public class FriendsPairing {

    public static int countWays(int n) {

        // base cases
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        int single = countWays(n - 1);

        // pair
        int pair = (n - 1) * countWays(n - 2);

        // total
        return single + pair;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("total ways: " + countWays(n));
    }
}

// output
// total ways: 10