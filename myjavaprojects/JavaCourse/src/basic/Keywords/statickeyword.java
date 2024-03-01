package basic.Keywords;

/**
 * blocks
 * variables
 * methods
 * classes
*/
public class statickeyword {
 
    //static variable
    static int a = 10;
    static int b;

    //static block
    static{
        b= a * a;
        System.out.println(b);
    }

    //static method
    static void m1(){
        System.out.println("i'm static method");
    }

    public static void main(String[] args) {
        m1();
        System.out.println(a+ " "+b);
    }
}
