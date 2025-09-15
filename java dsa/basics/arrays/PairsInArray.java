// author: @rabhisekkar
// description: pairs in array

// find all the pairs in an given array
// total pairs = (n(n-1))/2
// if n = 5, tp = (5*4)/2 = 10

public class PairsInArray {
    //finding pairs
    public static void printPairs(int arr[]){
        int tp=0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: " + tp);
    }

    //main method
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};

        printPairs(arr);
    }
}

//output
// (2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10)
// (6,8) (6,10)
// (8,10)

// total pairs: 10

// tc = O(n^2)