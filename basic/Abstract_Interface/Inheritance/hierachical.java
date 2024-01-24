package Basic.Abstract_Interface.Inheritance;

class School {
    void english() {
        System.out.println("English is a language");
    }
}

class Classone extends School {
    void literature() {
        System.out.println("Alphabets english");
    }
}

class Classtwo extends School {
    void langpaper() {
        System.out.println("making sentence in english");
    }
}

class Classthree extends School {
    void langsub() {
        System.out.println("grammer in english");
    }
}

public class hierachical {

    public static void main(String[] args) {
        Classtwo sch = new Classtwo();
        sch.langpaper();
        sch.english();
    }
}
