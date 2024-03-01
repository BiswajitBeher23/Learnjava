package basic.Abstract_Interface.Inheritance;

/**
 * Single inheritance
 * Multiple inheritance
 * Multilevel interitance
 * Hierarchical inheritance
 * Hybrid inheritance
 */

/**
 * The super keyword is similar to “this” keyword.
 * 
 * The keyword super can be used to access any data member or methods of the
 * parent class.
 * 
 * Super keyword can be used at variable, method and constructor level.
 */

 /**Single inheritance & Multilevel inheritance */

class Animal {
    void pet() {
        System.out.println("domestic pet animal");
    }
}

class domestic extends Animal {
    void cat() {
        super.pet();
        System.out.println("Cat meow");
    }

    void Dog() {
        super.pet();
        System.out.println("dog barks");
    }
}

public class basic_inheritance {

    public static void main(String[] args) {

        domestic dm = new domestic();
        dm.cat();
        dm.Dog();
       // dm.pet();
    }
}
