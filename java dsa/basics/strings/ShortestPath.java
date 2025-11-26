// author: @rabhisekkar
// description: find shortest path

// given a route containing 4 directions (E, W, N, S) find the
// shortest path/ distance to reach destination. path: "WNEENESENNN"

// Euclidean formula: d=sqrt((x2-x1)^2 + (y2-y1)^2)
// here x1 = 0, y1 =0, so d = sqrt((x^2) + (y^2))


public class ShortestPath{
    //finding shortest path
    public static double getPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'S') {
                y--;
            }
            else{
                continue;
            }
        }
        double ans = Math.sqrt((x*x) + (y*y));
        return ans;
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println("path: " + path);
        System.out.println("shortest path: " + getPath(path));
    }
}

// output
// path: WNEENESENNN
// shortest path: 5.0

// tc = O(n)