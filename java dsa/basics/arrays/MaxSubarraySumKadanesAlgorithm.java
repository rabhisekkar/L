// author: @rabhisekkar
// description: max subarray sum (Kadane's Algorithm)

// find max subarray sum of a given array
// if a[] = {1,2,3}
// subarrays: {1} {1,2} {1,2,3} {2} {2,3} {3}
// max subarray sum = 1, 3, (6), 2, 5, 3 = 6

public class MaxSubarraySumKadanesAlgorithm {
    // find max subarray sum using optimized kadane's algorithm
    public static int optimizedKadanes(int numbers[]){
        int currSum = numbers[0], maxSum = numbers[0];

        for(int i=0; i<numbers.length; i++){
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    // find max subarray sum using basic kadane's algorithm
    public static int basicKadanes(int numbers[]){
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] + currSum > 0){
                currSum += numbers[i];
            } else {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        //special case when all elements in an array are -ve
        //then kadan's algo will give 0. so this is special case
        if(maxSum == Integer.MIN_VALUE){
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] > maxSum){
                    maxSum = numbers[i];
                }
            }
        }
        return maxSum;
    }
    
    //main method
    public static void main(String[] args){
        int numbers[] = {1, -2, 6, -1, 3};

        //maxSubarraySum = {6, -1, 3} = 8
        System.out.println("Kadane's result: " + basicKadanes(numbers));
        System.out.println("Optimized Kadane's result: " + optimizedKadanes(numbers));
    }
}

// output
// Kadane's result: 8
// Optimized Kadane's result: 8