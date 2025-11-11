// author: @rabhisekkar
// description: Inbuilt sort

// predefined inbuilt function to sort array
// 1. entire array
// 2. specific part of an array
// 3. entire array in reverse order
// 4. specific part of an array in reverse order

// note: endig index is non-imclusive
// if we want to sort till 2nd index we have to write/pass 3

// ex: arr = {5, 4, 1, 3, 2}
// sorted arr = {1, 2, 3, 4, 5}

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    //printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    //printing array
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. entire array
        System.out.println("\n1. entire array: ");
        int arr[] = {5, 4, 1, 3, 2};

        System.out.print("arr before sorting: ");
        printArray(arr);

        Arrays.sort(arr);

        System.out.print("arr after sorting: ");
        printArray(arr);

        // 2. specific part of an array
        System.out.println("\n2. specific part of an array: ");
        int arr1[] = {5, 4, 1, 3, 2};

        System.out.print("arr1 before sorting: ");
        printArray(arr1);

        Arrays.sort(arr1, 0, 3);

        System.out.print("arr1 after sorting: ");
        printArray(arr1);

        // 3. entire array in reverse order
        System.out.println("\n3. entire array in reverse order: ");
        Integer arr2[] = {5, 4, 1, 3, 2};

        System.out.print("arr2 before sorting: ");
        printArray(arr2);

        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.print("arr2 after sorting: ");
        printArray(arr2);

        // 4. specific part of an array in reverse order
        System.out.println("\n4. specific part of an array in reverse order: ");
        Integer arr3[] = {1, 4, 5, 3, 2};

        System.out.print("arr3 before sorting: ");
        printArray(arr3);

        Arrays.sort(arr3, 0, 3, Collections.reverseOrder());

        System.out.print("arr3 after sorting: ");
        printArray(arr3);
    }
}

// output
// 1. entire array:
// arr before sorting: 5   4       1       3       2
// arr after sorting: 1    2       3       4       5

// 2. specific part of an array:
// arr1 before sorting: 5  4       1       3       2
// arr1 after sorting: 1   4       5       3       2

// 3. entire array in reverse order:
// arr2 before sorting: 5  4       1       3       2
// arr2 after sorting: 5   4       3       2       1

// 4. specific part of an array in reverse order:
// arr3 before sorting: 1  4       5       3       2
// arr3 after sorting: 5   4       1       3       2

// tc = O(n log n)