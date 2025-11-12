// author: @rabhisekkar
// description: Counting sort

// create count array, store frequency of numbers in that array

// counting sort is used when the quantity might be high but range btn
// min & max is very low (this code is for sorting only on +ve numbers)

// ex: arr = {1, 4, 1, 3, 2, 4, 3, 7}
// count arr = {0, 2, 1, 2, 2, 0, 0, 1}
// sorted arr = {1, 1, 2, 3, 3, 4, 4, 7}

public class CountingSort {
    //printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.err.println();
    }

    // counting sort
    public static void countingSorting(int arr[]){
        // finding largest in array/ range/ max no
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // calculating frequency
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;  //original array index from 0
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;    //when update value in original array then go to next index
                count[i]--; //decrease frequency in count array after updating in original arr
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        System.out.print("arr before sorting: ");
        printArray(arr);

        countingSorting(arr);

        System.out.print("arr after sorting: ");
        printArray(arr);
    }
}

// output
// arr before sorting: 1   4       1       3       2       4       3       7
// arr after sorting: 1    1       2       3       3       4       4       7

// tc = O(n + k) or O(n + range)