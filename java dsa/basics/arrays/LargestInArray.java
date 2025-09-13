// author: @rabhisekkar
// description: largest in array

// find the largest number in a given array

public class LargestInArray {
    //find largest in array
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;    // -infinity

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    //main method
    public static void main(String args[]){
        int arr[] = {1, 2, 6, 3, 5};

        int largest = getLargest(arr);
        System.out.println("largest in array is: " + largest);
    }
}

//output
//largest in array is: 6