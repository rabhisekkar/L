// author: @rabhisekkar
// description: for a given string,
// convet the first letter of each word to uppercase

// "hi, this is rxl." -> "Hi, This Is Rxl."

public class ConvertCharToUppercase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                // i<str.length()-1 is for string who have ' ' at last
                // ex: "RXL "
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, this is rxl.";
        System.out.println(toUpperCase(str));
    }
}

// output
// Hi, This Is Rxl.