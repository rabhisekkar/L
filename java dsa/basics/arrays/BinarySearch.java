// author: @rabhisekkar
// description: binary search

// demonstration of binary search

public class BinarySearch {
    //binary search
    public static int binarySearch1(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){    //key found
                return mid;
            } else if(arr[mid] > key) { //search left half
                end = mid-1;    //update end

            } else {  //(arr[mid] < key) -> search right half
                start = mid+1;  //update start
            }
        }
        return -1;
    }
    //main method
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = binarySearch1(arr, key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println("key at index: " + index);
        }
    }
}

//output
//key at index: 4

//tc = O(log n)