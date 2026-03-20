/*  author: @rabhisekkar
    description: quick sort using pivot and partition (divide and conquer)

    a. Pick a pivot
    b. Partition (Rearrange array so: left  < pivot < right)
    c. Recursively apply on left & right

    TC = O(n log n) average, O(n^2) worst
    SC = O(log n)
*/

public class QuickSort {

    public static void quickSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei);  // pivot index after partition

        quickSort(arr, si, pIdx - 1);    // left part
        quickSort(arr, pIdx + 1, ei);    // right part
    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];    //last element as pivot
        int i = si - 1;    // to make place for elements smaller than pivot
        
        for(int j = si; j < ei; j++){

            if(arr[j] <= pivot){
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //to place pivot in correct position
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;    // pivot index
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length-1);

        // to print array
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// output
// 2 3 5 6 8 9