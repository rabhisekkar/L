/*  author: @rabhisekkar
    description: reverse an array using recursion

    ex: {1, 2, 3, 4, 5}
    output: {5, 4, 3, 2, 1}

    TC = O(n)
    SC = O(n)
*/

public class ReverseArray {

    public static void reverse(int arr[], int i, int j) {

        // base case
        if (i >= j) {
            return;
        }

        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // recursive call
        reverse(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// output
// 5 4 3 2 1