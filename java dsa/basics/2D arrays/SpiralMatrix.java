// author: @rabhisekkar
// description: spiral matrix

// print valurs of a of a given matrix in spiral order

// 2d array: 
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// spiral matrix of above 2d array
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

public class SpiralMatrix {
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

    //printing spiral matrix
    public static void printSpiralMatrix(int matrix[][]){
        int row=matrix.length, col=matrix[0].length;

        System.out.println("spiral: ");
        int startRow=0, endRow=row-1, startCol=0, endCol=col-1;
        while (startRow <= endRow && startCol <= endCol) {
            //j for col, i for row printing
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            if(startRow < endRow){
                for(int j=endCol-1; j>=startCol; j--){
                    System.out.print(matrix[endRow][j] + " ");
                }
            }
            //left
            if(startCol < endCol){
                for(int i=endRow-1; i>startRow; i--){
                    System.out.print(matrix[i][startCol] + " ");
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};    //4x4
        printArray(matrix);
        printSpiralMatrix(matrix);

        int matrix1[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12}}; //3x4
        printArray(matrix1);
        printSpiralMatrix(matrix1);

        int matrix2[][] = {{1, 2, 3},
                          {5, 6, 7},
                          {9, 10, 11},
                        {12, 14, 15}};  //4x3
        printArray(matrix2);
        printSpiralMatrix(matrix2);

        int matrix3[][] = {{1, 2, 3, 4, 5}};    //1x5
        printArray(matrix3);
        printSpiralMatrix(matrix3);
    }
}

// output
// 2d array:
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// spiral:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

// 2d array:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// spiral:
// 1 2 3 4 8 12 11 10 9 5 6 7

// 2d array:
// 1 2 3
// 5 6 7
// 9 10 11
// 12 14 15
// spiral:
// 1 2 3 7 11 15 14 12 9 5 6 10

// 2d array:
// 1 2 3 4 5
// spiral:
// 1 2 3 4 5