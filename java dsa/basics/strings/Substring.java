// author: @rabhisekkar
// description: substring

// manually finding substring and substring function demonstration

// si: starting index, ei: ending index
// ei is non inclusive, means if we want 4th index to be ei, we will say ei=5

// str = "HelloRxl"
// if si=3, ei=6 then substring will be "loR"

public class Substring{

    //find substring manually
    public static String findSubstring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            //concatenation
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        String str = "HelloRXL";
        System.out.println(str);
        
        // our substring method
        System.out.println("substring: " + findSubstring(str, 3, 6));
        
        // inbuilt substring function
        System.out.println("substring: " + str.substring(3,6));
    }
}

// output
// HelloRXL
// substring: loR
// substring: loR