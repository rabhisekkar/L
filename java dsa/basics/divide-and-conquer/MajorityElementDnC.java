/*  author: @rabhisekkar
    description: find majority element using divide and conquer

    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than n/2 times.
    You may assume that the majority element always exists in the array.

    Ex:
    input: nums = [4, 1, 4]
    output: 4

    Constraints:
    1 <= n <= 5 * 10^4
    -10^9 <= nums[i] <= 10^9

    Logic:
    1. Divide array into two halves
    2. Recursively find majority in:
            left half
            right half
    3. If both are same → return it
    4. If different → count both → return the one with higher count

    TC = O(n log n)
    SC = O(log n)
*/

public class MajorityElementDnC {
    public static int majorityElement(int[] nums){
        return majorityElementRec(nums, 0, nums.length-1);
    }

    public static int majorityElementRec(int[] nums, int lo, int hi){

        // base case
        // the only element in an array of size 1 is the majority element
        if(lo == hi){
            return nums[lo];
        }
        
        // recurse on left and right halves of this slice
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // if the two halves agree on the majority element, return it
        if(left == right) {
            return left;
        }

        // otherwise, count both elements and return the majority
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        if(leftCount > rightCount){
            return left;
        } else {    // if leftCount <= rightCount
            return right;
        }
    }

    public static int countInRange(int[] nums, int target, int lo, int hi){
        int count = 0;

        for(int i = lo; i <= hi; i++){
            if(nums[i] == target){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority element: " + majorityElement(nums));
    }
}

// output
// Majority element: 2