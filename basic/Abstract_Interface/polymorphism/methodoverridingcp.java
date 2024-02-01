package basic.Abstract_Interface.polymorphism;

class Parent {
    void show(){
        System.out.println("Parent's show");
    }
}

class Child extends Parent {
    void show(){
        System.out.println("Child's show");
    }
}

class grandchild extends Child {
    void show(){
        System.out.println("Grandchild's show");
    }
}

public class methodoverridingcp extends grandchild {
    
    public static void main(String[] args) {
        Parent obj1 = new grandchild();
        obj1.show();
    }

}
