/*  author: @rabhisekkar
    description: demonstrate copy constructors -> swallow and deep copy

    Note: Shallow copy shares memory, deep copy duplicates memory.
*/

public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "rabhisekkar";
        s1.roll = 1341;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.password = "xyz";

        s1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    // shallow copy constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[3];
        for(int i=0; i<3; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // non-parameterized constructor
    Student(){
        System.out.println("constructor is called...");
    }
}

// output if we run shallow constructor
// constructor is called...
// 100
// 90
// 100

// output (deep constructor)
// constructor is called...
// 100
// 90
// 80