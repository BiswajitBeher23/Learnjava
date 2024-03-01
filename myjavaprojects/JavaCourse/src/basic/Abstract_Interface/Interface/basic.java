package basic.Abstract_Interface.Interface;

/**
 * Innerbasic
 */
interface Innerbasic {

    final int a = 10;
    
    void show();
}


public class basic implements Innerbasic {
    

    public void show() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        
        basic obj1 = new basic();
        obj1.show();
        System.out.println(a);
    }
}
