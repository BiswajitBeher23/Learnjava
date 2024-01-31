package accessmodifiers.pkg;

/**
 * Inneraccessmodify
 */
class Inneraccessmodify {

    protected void mtd() {
        System.out.println("protected modifer");
    }

}

/**
 * Inneraccessmodify_1
 */
class Inneraccessmodify_1 {

    private int a = 10;

    public void mtd2() {
        System.out.println(this.a);
        System.out.println("private modifier");
    }
}

/**
 * Inneraccessmodify_2
 */
class Inneraccessmodify_2 {

    private Inneraccessmodify_2() {
        System.out.println("hello from constructor");
    }

}

public class accessmodify extends Inneraccessmodify {

    public void met() {
        System.out.println("Hello java");
    }

    public static void main(String[] args) {

        accessmodify c = new accessmodify();
        c.met();
        c.mtd();

        Inneraccessmodify ref = new Inneraccessmodify();
        ref.mtd();

        Inneraccessmodify reff = new accessmodify();
        reff.mtd();

        Inneraccessmodify_1 check = new Inneraccessmodify_1();
        check.mtd2();

    }

}
