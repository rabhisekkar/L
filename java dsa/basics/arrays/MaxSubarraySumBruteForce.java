// author: @rabhisekkar
// description: max subarray sum (brute-force)

// find max subarray sum of a given array
// if a[] = {1,2,3}
// subarrays: {1} {1,2} {1,2,3} {2} {2,3} {3}
// max subarray sum = 1, 3, (6), 2, 5, 3 = 6

public class MaxSubarraySumBruteForce {
    // find max subarray sum
    public static void findMaxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += numbers[k];  //subarray sum
                }
                System.out.println("currSum: " + currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max subarray sum: " + maxSum);
    }
    
    //main method
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};

        findMaxSubarraySum(numbers);
    }
}

// output

// currSum: 2
// currSum: 6
// currSum: 12
// currSum: 20
// currSum: 30
// currSum: 10
// currSum: 18
// currSum: 28
// currSum: 6
// currSum: 14
// currSum: 24
// currSum: 8
// currSum: 18
// currSum: 10
// max subarray sum: 30