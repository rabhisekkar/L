/*  author: @rabhisekkar
    description: find sum of elements in array using recursion

    ex: {1, 2, 3, 4}
    output: 10

    TC = O(n)
    SC = O(n)
*/

public class SumOfElementsInArray {

    public static int sum(int arr[], int i) {

        // base case
        if (i == arr.length) {
            return 0;
        }

        // recursive case
        return arr[i] + sum(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println("sum of elements: " + sum(arr, 0));
    }
}

// output
// sum of elements: 10