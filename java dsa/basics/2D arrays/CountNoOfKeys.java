// author: @rabhisekkar
// description: no of times a key appeared in 2d array

// print the number of 7's that are in the 2d array

// ex:
// input: int[][] = {{4,7,8}, {8,8,7}};
// output: 2

public class CountNoOfKeys{
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
    //no of keys appeared
    public static int countOfKey(int matrix [][], int key){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    //main
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 5, 3, 4},
                          {7, 9, 7, 8},
                          {2, 3, 3, 5}};
        int key = 3;

        printArray(matrix);
        System.out.println("\nkey: " + key + "\nno of keys: " + countOfKey(matrix, key));
    }
}

// output
// 2d array:
// 1 2 3 4 
// 5 5 3 4
// 7 9 7 8
// 2 3 3 5

// key: 3
// no of keys: 4