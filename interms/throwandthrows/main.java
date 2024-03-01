package interms.throwandthrows;

public class main {
    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("caught inside fun()");
            throw e;
        }
    }

    public static void main(String[] args) {

        try {
            fun();
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("caught in main");
        }
    }

}
