
public class throwexp {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun()");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            // TODO: handle exception
            System.out.println("Caught in main");
        }
    }
}
