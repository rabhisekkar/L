// author: @rabhisekkar
// description: string comparison

// using equal() over == to compare string values

public class StringComparison{
    public static void main(String args[]){
        String s1 = "rxl";
        String s2 = "rxl";
        String s3 = new String("rxl");
        String s4 = new String("rxl");

        // using ==
        // java use a concept named interning. so in follwing code it
        // will show s1 != s3, but the value of s1 and s3 are same.
        System.out.println("using ==");
        if(s1 == s2){
            System.out.println("s1 = s2");
        } else {
            System.out.println("s1 != s2");
        }
        if(s1 == s3){   
            System.out.println("s1 = s3");
        } else {
            System.out.println("s1 != s3");
        }
        if(s3 == s4){   
            System.out.println("s3 = s4");
        } else {
            System.out.println("s3 != s4");
        }

        // using equal()
        // equal() checks only values
        System.out.println("\nusing equal()");
        if(s1.equals(s2)){
            System.out.println("s1 = s2");
        } else {
            System.out.println("s1 != s2");
        }
        if(s1.equals(s3)){   
            System.out.println("s1 = s3");
        } else {
            System.out.println("s1 != s3");
        }
    }
}

// output

// using ==
// s1 = s2
// s1 != s3
// s3 != s4

// using equal()
// s1 = s2
// s1 = s3