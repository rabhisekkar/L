// author: @rabhisekkar
// description: string compression

// "aaabbcccdd" -> "a3b2c3d2"

public class StringCompression {
    // compress is better than compress1
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static String compress1(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(i == str.length() - 1 || str.charAt(i)!=str.charAt(i+1)){
                sb.append(str.charAt(i));
                continue;
            }

            char ch = str.charAt(i);
            int count=0;
            for (int j=i; j<str.length() && str.charAt(j) == ch; j++){
                count++;
            }
            sb.append(str.charAt(i)).append(count);
            i = i+count-1;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str = "aaabbcccdd";
        System.out.println(compress(str));
        System.out.println(compress1(str));
    }
}

// output
// a3b2c3d2