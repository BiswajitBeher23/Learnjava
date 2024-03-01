package basic.Abstract_Interface.polymorphism;

public class methodoverriding {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        obj1.show();
        // Private methods can not be overridden
        // obj1.tv1();

        obj1.tv2();
        obj1.sony();
        obj1.m1();
        obj1.m2();

        Parent obj2 = new Child();
        obj2.show();
        obj2.sony();
        obj2.tv2();
        obj2.m1();
        obj2.m2();
    }
}

class Parent {
    void show() {
        System.out.println("Parent's tv show");
    }

    // Static methods can not be overridden
    static void aajtak() {
        System.out.println("Parent watching news");
    }

    // Final methods can not be overridden
    final void sony() {
        System.out.println("sony channel");
    }

    // private void tv1() {
    //     System.out.println("Parent watching tv zee tv show");
    // }

    protected void tv2() {
        System.out.println("Parent watching tv show");
    }

    void m1(){
        System.out.println("from parent m1");
    }

    void m2(){
        System.out.println("from parent m2");
    }
}

class Child extends Parent {

    // The overriding method must have the same return type
    void show() {
        // this.tv1();

        //Invoking overridden method from sub-class
        super.tv2();
        System.out.println("child's tv show");
    }

    // This instance method cannot override the static method from Parent
    // void aajtak(){
    // System.out.println("Kid not interested in news");
    // }

    // Cannot override the final method from Parent
    // void sony() {
    // System.out.println("kid searching sony channel");
    // }

    // private void tv1() {
    //     System.out.println("Child watching tv nick tv show");
    // }

    public void tv2() {
        System.out.println("Child watching tv show");
    }

    void m1() throws ArithmeticException {
        System.out.println("from child m1");
    }

    void m2() throws RuntimeException {
        System.out.println(" from child m2");
    }
}