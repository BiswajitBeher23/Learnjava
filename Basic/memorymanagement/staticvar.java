package Basic.memorymanagement;

/**
 * staticvar
 * 
 * Static Variables
 * Static Methods
 * Static Blocks Of Code
 * 
 * static variable
 * A single copy to be shared by all instances of the class
 * A static variable can be accessed directly by the class name and doesn’t need
 * any object
 * 
 * static method
 * A static method can call only other static methods and can not call a
 * non-static method from it.
 * A static method can be accessed directly by the class name and doesn’t need
 * any object
 * A static method cannot refer to “this” or “super” keywords in anyway
 */
public class staticvar {

    static int x;
    static int y;
    static {
        x = 10;
        y = 30;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showData();
        Student s2 = new Student();
        s2.showData();
        Student.b++;
        s1.showData();
        System.out.println("Value of x" + x);
        System.out.println("Value of y" + y);

    }
}

class Student {
    int a;
    static int b;

    Student() {
        b++;
    }

    public void showData() {
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }
    // public static void increment(){
    // a++;
    // }
}