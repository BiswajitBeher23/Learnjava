package interm.Exceptionhanding;

/**
 * ArithmeticException
 * RuntimeException
 * ArrayIndexOutOfBoundsException
 * ClassNotFoundException
 * FileNotFoundException
 * IOException
 * InterruptedException
 * NoSuchFieldException
 * NoSuchMethodException
 * NullPointerException
 * NumberFormatException
 * StringIndexOutOfBoundsException
 * IllegalArgumentException
 * IllegalStateException
 * *
 */
public class arithmeticexp {

    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("can't diivide"+ e);
        }
    }
}
