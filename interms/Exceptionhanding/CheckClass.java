package interms.Exceptionhanding;

import java.lang.reflect.Method;

class MyClass {
    void m2() {
        System.out.println("hello");
    }
}

public class CheckClass {

    public static void main(String[] args) {
        String className = "MyClass";

        try {
            Class<?> myClass = Class.forName(className);
            System.out.println("The class " + className + " is present.");

            // Get the methods of the class.
            Method[] methods = myClass.getMethods();

            // Print the methods of the class.
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("The class " + className + " is not present.");
        }
    }
}
