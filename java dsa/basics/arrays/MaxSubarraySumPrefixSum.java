// author: @rabhisekkar
// description: max subarray sum (prefix sum)

// find max subarray sum of a given array
// if a[] = {1,2,3}
// subarrays: {1} {1,2} {1,2,3} {2} {2,3} {3}
// max subarray sum = 1, 3, (6), 2, 5, 3 = 6

public class MaxSubarraySumPrefixSum {
    // find max subarray sum
    public static void findMaxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //calculate prefix array
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix [i-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max subarray sum: " + maxSum);
    }
    
    //main method
    public static void main(String[] args){
        int numbers[] = {1, -2, 6, -1, 3};

        //maxSubarraySum = {6, -1, 3} = 8
        findMaxSubarraySum(numbers);
    }
}

// output
// max subarray sum: 8