/*  author: @rabhisekkar
    description: find and print all indices of a given key in an integer array using recursion

    problem:
    given an array of size N, print all occurrences (indices) of a given element (key)

    example:
    arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}
    key = 2

    output:
    1 5 7 8

    TC = O(n)
    SC = O(n)  // recursion stack
*/

public class FindAllOccurrences {

    public static void findOccurrences(int arr[], int key, int i) {

        // base case
        if (i == arr.length) {
            return;
        }

        // check current index
        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        // recursive call
        findOccurrences(arr, key, i + 1);
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        findOccurrences(arr, key, 0);
    }
}

// output
// 1 5 7 8