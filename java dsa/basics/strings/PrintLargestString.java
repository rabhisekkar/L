// author: @rabhisekkar
// description: find largest string in lexicographic order

// for a given set of Strings, print the largest string
// "apple", "mango", "banana"   ans: largest -> mango

// Lexicographic order is a way of ordering from left to right,
// similar to how a dictionary is organized. ex: aabad<aabae, y<z, etc.

// use compareTo(), or compareToIgnoreCase()




public class PrintLargestString{
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(fruits[i].compareToIgnoreCase(largest) > 0){
                //or (largest.compareToIgnoreCase(fruits[i]) < 0)
                largest = fruits[i];
            }
        }
        System.out.println("largest: " + largest);
    }
}

// output
// largest: mango

// tc = O(n * m)
// n = number of strings
// m = average length of each string