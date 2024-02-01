package basic.Abstract_Interface.polymorphism;

/**
 * By changing number of arguments
 * By changing the data type
 */

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Adding {
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}

public class methodoverloading {
    public static void main(String[] args) {

        System.out.println(Adder.add(12, 13));
        System.out.println(Adder.add(14, 20, 33));

        System.out.println(Adding.add(12, 19));
        System.out.println(Adding.add(12.3, 23.4));
    }
}
