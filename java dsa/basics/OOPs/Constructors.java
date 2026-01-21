/*  author: @rabhisekkar
    description: demonstrate constructors
*/

public class Constructors {
    public static void main(String[] args) {
        // this is constructor overloading: example of compile-time polymorphism
        // which constructor will be called for which object
        Student s1 = new Student();
        Student s2 = new Student("rabhisekkar");
        Student s3 = new Student("rabhisekkar", 1341);

        // error, because no constructor with only int parameter
        // Student s4 = new Student(1341);

        System.out.println(s1.name + " " + s2.name + " " + s3.name + " " + s3.roll);
    }
}
class Student {
    String name;
    int roll;

    // non-parameterized constructor
    Student(){
        System.out.println("constructor is called...");
    }

    // parameterized constructor
    Student(String name){
        this.name = name;
    }

    // parameterized constructor
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}

// output
// constructor is called...
// null rabhisekkar rabhisekkar 1341