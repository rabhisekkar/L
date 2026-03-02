/*  author: @rabhisekkar
    description: remove duplicates from string using recursion

    ex: "rabhisekkar"
    output: "rabhisek"

    TC = O(n)
    SC = O(n)
*/

public class RemoveDuplicates {

    public static void removeDup(String str, int i, StringBuilder newStr, boolean[] map) {

        // base case
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(i);

        if (map[curr - 'a']) {
            // already seen
            removeDup(str, i + 1, newStr, map);
        } else {
            // first occurrence
            map[curr - 'a'] = true;
            newStr.append(curr);
            removeDup(str, i + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "rabhisekkar";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

// output
// rabhisek