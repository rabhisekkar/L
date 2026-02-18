/*  author: @rabhisekkar
    description: find first occurrence of an element using recursion

    ex: arr = {2, 4, 3, 4, 5}, key = 4
    output: 1

    TC = O(n)
    SC = O(n)
*/

public class FirstOccurrence {

    public static int firstOcc(int arr[], int key, int i) {

        // base case
        if (i == arr.length) {
            return -1;   // not found
        }

        // check current index
        if (arr[i] == key) {
            return i;
        }

        // search in remaining array
        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 4, 5};
        int key = 4;

        System.out.println("first occurrence index: " + firstOcc(arr, key, 0));
    }
}

// output
// first occurrence index: 1