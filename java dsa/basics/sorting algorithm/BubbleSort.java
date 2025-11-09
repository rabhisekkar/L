// author: @rabhisekkar
// description: bubble sort

// largest elements come to the end of array by swapping with adjacent elements

// ex: arr = {5, 4, 1, 3, 2}
// sorted arr = {1, 2, 3, 4, 5}

public class BubbleSort {
    //printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.err.println();
    }

    //bubble sort
    public static void bubbleSorting(int arr[]){
        for(int i=0; i<arr.length-1; i++){  //turns
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        System.out.print("arr before sorting: ");
        printArray(arr);

        bubbleSorting(arr);

        System.out.print("arr after sorting: ");
        printArray(arr);
    }
}

// output
// arr before sorting: 5   4       1       3       2
// arr after sorting: 1    2       3       4       5

// tc = O(n^2)