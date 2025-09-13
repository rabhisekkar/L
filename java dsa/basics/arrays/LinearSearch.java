// author: @rabhisekkar
// description: linear search

// demonstration of linear search

public class LinearSearch {
    // linear search
    public static int linearSearch1(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }
    // main method
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        
        int index = linearSearch1(numbers, key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println("key is at index: " + index);
        }
    }    
}

//output
//key is at index: 4

//tc = O(n)