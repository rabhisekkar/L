/*  author: @rabhisekkar
    description: search in rotated sorted array using modified binary search

    sorted, rotated array with distinct elements (ascending order).
    it is rotated at some pivot. Find the index of given target element.

    ex: arr = {4, 5, 6, 7, 0, 1, 2}, target = 0
    output: 4

    TC = O(log n)
    SC = O(log n)   // recursion stack
*/

public class RotatedSearch {
    public static int search(int arr[], int target, int si, int ei){
        // base case
        if(ei < si){
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if(arr[mid] == target){
            return mid;
        }

        // mid on left sorted part
        if(arr[si] <= arr[mid]){

            // if target is between si and mid
            if(arr[si] <= target && target < arr[mid]){    // left
                return search(arr, target, si, mid - 1);
            } else {    // right
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on right sorted part
        else {

            // if target is between mid and ei
            if(arr[mid] < target && target <= arr[ei]){    // right
                return search(arr, target, mid + 1, ei);
            } else {    // left
                return search(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(arr, target, 0, arr.length-1));
    }
}

// output
// 4