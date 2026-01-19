/*  author: @rabhisekkar
    description: classes and objects
*/
public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();    // create a pen object called p1
        System.out.println("color: "+ p1.color);
        System.out.println("tip: " + p1.tip);

        // accessing class through object
        p1.setColor("red");
        p1.setTip(4);
        System.out.println("color: "+ p1.color);
        System.out.println("tip: " + p1.tip);

        // fields can be accessed directly
        // to restrict this, access modifiers are used
        p1.color = "black";
        System.out.println("color: "+ p1.color);
    }
}
class Pen {
    // properties/ atributes
    String color;
    int tip;

    //functions/ behaviors
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

// output
// color: null
// tip: 0
// color: red
// tip: 4
// color: black