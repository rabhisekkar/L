// author: @rabhisekkar
// description: selection sort

// pick the smallest (from unsorted), put it at the beginning

// ex: arr = {5, 4, 1, 3, 2}
// sorted arr = {1, 2, 3, 4, 5}

public class SelectionSort {
    //printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.err.println();
    }

    //selection sort
    public static void selectionSorting(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        System.out.print("arr before sorting: ");
        printArray(arr);

        selectionSorting(arr);

        System.out.print("arr after sorting: ");
        printArray(arr);
    }
}

// output
// arr before sorting: 5   4       1       3       2
// arr after sorting: 1    2       3       4       5

// tc = O(n^2)