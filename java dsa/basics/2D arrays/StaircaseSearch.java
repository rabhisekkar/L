// author: @rabhisekkar
// description: staircase search

// searching an element in 2d sorted array using staricase search
// works only on sorted array

// 2d array:
// 10 20 30 40 
// 15 25 35 45
// 27 29 37 48
// 32 33 39 50
// key: 33
// key at index: (3, 1)

public class StaircaseSearch {
    //printing array
    public static void printArray(int matrix[][]){
        int n=matrix.length, m=matrix[0].length;

        System.out.println("\n2d array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // staircase Search
    // tc = O(n + m)
    public static void staircaseSearching(int matrix [][], int key){
        int i = 0;  //row
        int j = matrix[0].length-1;    //column
        while(i < matrix.length && j>=0){
            if(key == matrix[i][j]){
                System.out.println("key found at index: (" + i + ", " + j + ")");
                return;
            }
            else if(key < matrix[i][j]){
                j--;    //go left
            }
            else{   //key > matirx[i][j]
                i++;    //go down
            }
        }
        System.out.println("key not found");
        return;
    }
    //main
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;

        printArray(matrix);
        System.out.println("key: " + key);

        staircaseSearching(matrix, key);
    }
}

// output
// 2d array:
// 10 20 30 40 
// 15 25 35 45
// 27 29 37 48
// 32 33 39 50
// key: 33
// key found at index: (3, 1)

// tc = O(n + m)