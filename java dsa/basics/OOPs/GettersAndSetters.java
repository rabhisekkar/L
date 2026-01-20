/*  author: @rabhisekkar
    description: demonstrate getters and setters
    sn: 21
*/

public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("black");
        p1.setTip(4);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        // below line will give error, color has private access in Pen
        // System.out.println("color: "+ p1.color);
    }
}

class Pen{
    private String color;
    private int tip;

    // getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // setters
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

// output
// black
// 4