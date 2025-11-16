// author: @rabhisekkar
// description: print diagonal sum of a 2d array

// diagonal Sum = primary diagonal sum + secondary diagonal sum
// only works on matrix where rows = cols

// 2d array: 
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

//diagonal sum = 1+6+11+16+4+7+10+13 = 68

// 2d array:
// 1 2 3
// 4 5 6
// 7 8 9
// diagonal sum = 1+5(add 5 once)+9+3+7 = 25

public class diagonalSum {
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
    //diagonal sum 1 (brute force)
    //tc = O(n^2)
    public static void printDiagonalSum(int matrix [][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //primary if i==j, secondary if i+j==matrix.length-1
                if(i==j || i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("diagonal sum = " + sum);
    }
    //diagonal sum 2 (optimized)
    //tc = O(n)
    public static void printDiagonalSum1(int matrix [][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];
            
            //secondary diagonal
            //contition to prevent adding the center element twice for odd matrix
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("diagonal sum = " + sum);
    }
    //main
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        printArray(matrix);
        printDiagonalSum(matrix);
        printDiagonalSum1(matrix);
        int matrix1[][] = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        printArray(matrix1);
        printDiagonalSum(matrix1);
        printDiagonalSum1(matrix1);
    }
}

// output
// 2d array:
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// diagonal sum = 68
// diagonal sum = 68

// 2d array:
// 1 2 3
// 4 5 6
// 7 8 9
// diagonal sum = 25
// diagonal sum = 25