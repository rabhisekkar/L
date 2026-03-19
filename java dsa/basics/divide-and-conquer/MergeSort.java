/*  author: @rabhisekkar
    description: merge sort using divide and conquer

    divide array until smallest → then combine/merge in sorted way

    TC = O(n log n)
    SC = O(n)
*/

public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){

        // base case
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;

        // left part
        mergeSort(arr, si, mid);

        // right part
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        
        int temp[] = new int[ei - si + 1];

        int i = si;    // iterator for left part
        int j = mid+1;    // iterator for right part
        int k = 0;    // iteraotor for new temp array

        while(i <= mid && j <= ei) {
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // a[i++]; -> means a[i]; i++; -> post increment operator

        // left part remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length-1);

        // to print array
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// output
// 2 3 5 6 8 9 