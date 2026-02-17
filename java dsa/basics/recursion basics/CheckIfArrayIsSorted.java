/*  author: @rabhisekkar
    description: check if array is sorted or not

    note: is current pair sorted AND is remaining array sorted?

    ex: {1, 2, 3, 4} -> sorted -> true
    {1, 2, 4, 3} -> unsorted -> false
*/

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int arr[], int i) {

        if(i >= arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = {1, 2, 4, 3};
        System.out.println(isSorted(arr, 0));   //true
        System.out.println(isSorted(arr1, 0));  //false
    }
}

// output
// true
// false