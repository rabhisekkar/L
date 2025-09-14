// author: @rabhisekkar
// description: array reverse

// demonstration of reverse of an array

public class ArrayReverse {
    //reverse the array
    public static void reverse(int arr[]){
        int first = 0, last = arr.length-1;
        while (first < last){
            //swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first += 1;
            last -= 1;
        }
    }

    //print array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        System.out.print("array before reverse: ");
        printArray(arr);

        reverse(arr);

        System.out.print("array after reverse: ");
        printArray(arr);
    }
}

// output
// array before reverse: 2 4 6 8 10 12 14 
// array after reverse: 14 12 10 8 6 4 2

//tc = O(n)