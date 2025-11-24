// author: @rabhisekkar
// description: charAt()

// charAt() demonstration
// print all chars of a string using charAt()

// charAt() gives the char present in that position. ex: str = "rxl"
// str.charAt(0) is r, str.charAt(1) is x, str.charAt(2) is l

public class CharAtMethod{
    //printing all chars of a string using charAt()
    public static void printAllChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[]){
        String name = "R Abhisek Kar";
        System.out.println("name: " + name);
        System.out.println("4rd char: " + name.charAt(3));

        printAllChar(name);
    }
}

// output
// name: R Abhisek Kar
// 4rd char: b
// R   A b h i s e k   K a r