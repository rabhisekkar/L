// author: @rabhisekkar
// description: transpose of a matrix

// transpose of a matrix is the process of swapping the rows to columns

// matrix
// 11 12 13
// 21 22 23

// transopsed matrix
// 11 21
// 12 22
// 13 23

public class TransposeOfMatrix{
    //printing array
    public static void printArray(int matrix[][]){
        int n=matrix.length, m=matrix[0].length;

        System.out.println("2d array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //transpose the matrix
    public static int[][] transposeMatrix(int matrix [][]){
        int transpose[][] = new int [matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    //main
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 5, 3, 4},
                          {7, 9, 7, 8}};

        System.out.println("original matrix: ");
        printArray(matrix);

        matrix = transposeMatrix(matrix);
        System.out.println("\ntransposed matrix: ");
        printArray(matrix);
    }
}

// output
// original matrix: 
// 2d array: 
// 1 2 3 4
// 5 5 3 4
// 7 9 7 8

// transposed matrix:
// 2d array:
// 1 5 7
// 2 5 9
// 3 3 7
// 4 4 8 