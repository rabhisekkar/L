/*  author: @rabhisekkar
    description: find last occurrence of an element using recursion

    ex: arr = {2, 4, 3, 4, 5}, key = 4
    output: 3

    TC = O(n)
    SC = O(n)
*/

public class LastOccurrence {

    public static int lastOcc(int arr[], int key, int i) {

        // base case
        if (i == arr.length) {
            return -1;
        }

        // search in remaining array first
        int isFoundInRest = lastOcc(arr, key, i + 1);

        // if found later, return that index
        if (isFoundInRest != -1) {
            return isFoundInRest;
        }

        // otherwise check current index
        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 4, 5};
        int key = 4;

        System.out.println("last occurrence index: " + lastOcc(arr, key, 0));
    }
}

// output
// last occurrence index: 3