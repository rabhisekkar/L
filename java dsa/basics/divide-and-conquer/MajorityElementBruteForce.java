/*  author: @rabhisekkar
    description: find majority element using brute force

    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than n/2 times.
    You may assume that the majority element always exists in the array.

    Ex:
    input: nums = [4, 1, 4]
    output: 4

    Constraints:
    1 <= n <= 5 * 10^4
    -10^9 <= nums[i] <= 10^9

    TC = O(n^2)
    SC = O(1)
*/

public class MajorityElementBruteForce {

    public static int majorityElement(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;

            for (int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            // majority condition
            if (count > n/2){
                return nums[i];
            }
        }

        return -1;    // never reached (majority always exists)
    }
    public static void main(String[] args) {
        int nums[] = {4, 1, 4};

        System.out.println("majority element: " + majorityElement(nums));
    }
}

// output
// majority element: 4