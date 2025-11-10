// author: @rabhisekkar
// description: Insertion sort

// pick an element (from unsorted), put it in the right pos in sorted part

// [steps to do]
// pick and keep the element in temp
// then move all elements & place the temp in vacant position

// ex: arr = {5, 4, 1, 3, 2}
// sorted arr = {1, 2, 3, 4, 5}

public class InsertionSort {
    //printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //insertion sort
    public static void insertionSorting(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int j = i-1;    //j is prev
            //finding out the correct pos to insert
            while(j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];    //push elements
                j--;
            }
            //insertion
            arr[j+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        System.out.print("arr before sorting: ");
        printArray(arr);

        insertionSorting(arr);

        System.out.print("arr after sorting: ");
        printArray(arr);
    }
}

// output
// arr before sorting: 5   4       1       3       2
// arr after sorting: 1    2       3       4       5

// tc = O(n^2)