// author: @rabhisekkar
// description: subarrays

// print subarrays of a given array
// if a[] = {1,2,3}
// subarrays: {1} {1,2} {1,2,3} {2} {2,3} {3}

// total subarrays = (n(n+1))/2
// if n = 5, tp = (5*6)/2 = 15

public class Subarrays {
    //print subarray
    public static void printSubarrays(int numbers[]){
        int ts=0;   //total subarrays
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays: " + ts);
    }
    
    //main method
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};

        printSubarrays(numbers);
    }
}

// output
// 2 
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10

// 6
// 6 8
// 6 8 10

// 8
// 8 10

// 10

// total subarrays: 15