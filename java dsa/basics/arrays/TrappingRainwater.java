// author: @rabhisekkar
// description: trapping rainwater problem

//Given a non-negative integers representing an elevation map where the
//width of each bar is 1. Compute how much water it can trap after raining.

public class TrappingRainwater {
    public static int trappedRainwater(int height[]){
        int n = height.length;

        //calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height [0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height [n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //calculate trapped water
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            //water level = min(max left, max right)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            //trapped water = water level - height
            //calculating total water level
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]= {4, 2, 0, 6, 3, 2, 5};
        System.out.println("trapped rain water: " + trappedRainwater(height));   //11
    }
}

//output
//trapped rain water: 11