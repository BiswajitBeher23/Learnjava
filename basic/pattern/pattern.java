package basic.pattern;

public class pattern {

    /**
     * Innerpattern
     */

    public static void Innerpattern(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int n = 6;
        Innerpattern(n);

    }
}
