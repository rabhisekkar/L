// author: @rabhisekkar
// description: 2D array creatiion

// create a 2d array, take input from user, display the array

// 2d array: (no of rows 4, no of columns 3)
// 1 2 3
// 4 5 6
// 7 8 9
// 10 11 12

import java.util.Scanner;

public class TwoDimensionalArrayCreation {
    public static void printArray(int matrix[][]){
        int n=matrix.length, m=matrix[0].length;    //for no. of rows and columns

        System.out.println("2d array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n,m;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows: ");
        n = sc.nextInt();
        System.out.println("enter no of columns: ");
        m = sc.nextInt();

        int matrix[][] = new int [n][m];
        
        System.out.println("enter values of 2d array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();    //taking input of values
            }
        }
        printArray(matrix);
        sc.close();
    }
}

// output
// enter no of rows: 
// 3
// enter no of columns: 
// 3
// enter values of 2d array: 
// 1 2 3 4 5 6 7 8 9
// 2d array: 
// 1 2 3
// 4 5 6
// 7 8 9