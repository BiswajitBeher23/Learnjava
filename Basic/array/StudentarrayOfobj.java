package Basic.array;

/**
 * StudentarrayOfobj
 */
public class StudentarrayOfobj {

    public static void main(String[] args) {

        // Declaring an array of student
        Student[] arr;

        // Allocating memmory for 2 objects of type student
        arr = new Student[2];

        // Initializing the first& second element
        // of the array
        arr[0] = new Student(131737441, "biswajit");
        arr[1] = new Student(839841468, "debasish");

        System.out.println("Student data in arr 0 :");
        arr[0].display();
        System.out.println("Student data in arr 0 :");
        arr[1].display();
    }
}

class Student {
    int id;
    String name;

    // Student class constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // display() method to display
    // student data
    public void display() {
        System.out.println("Student id is" + id + " " + "and student name is :" + name);
        System.out.println();
    }
}