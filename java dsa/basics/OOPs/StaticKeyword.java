/*  author: @rabhisekkar
    description: static keyword

    The static keyword in Java is a non-access modifier used to declare
    members that belong to the class itself, rather than to any specific
    instance (object) of that class. This means a single copy of a static
    member is shared across all objects, and it can be accessed without
    creating an object.
    
    Note: Static members should be accessed using the class name,
    not an object reference.
    instead of s1.schoolName we should use Student.schoolName
*/

public class StaticKeyword {
    public static void main(String[] args) {
        Student.schoolName = "ARK";
        // they can be accessed without creating an object
        System.out.println(Student.schoolName); //ARK

        Student s1 = new Student();
        System.out.println(Student.returnPercentage(97, 99));
        System.out.println(s1.schoolName);  //ARK

        Student s2 = new Student();
        System.out.println(Student.returnPercentage(95, 95));
        System.out.println(s2.schoolName);  //ARK
    }
}

class Student {
    static int returnPercentage(int psy, int phi){
        return (psy+phi)/2;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}

// output
// ARK
// 98
// ARK
// 95
// ARK