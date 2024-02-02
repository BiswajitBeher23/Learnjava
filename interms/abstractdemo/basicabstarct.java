package interms.abstractdemo;

public class basicabstarct {

    public static void main(String[] args) {
        Student s1 = new Student("Biswajit", "male", "9777746574", "maduakula, jajpur", "CEB", 12000.00, "java");
        Coaching c1 = new Student("Samarth", "male", "7685743543", "cuttack", "ABIT", 10000.00, "python");
        System.out.println("show student details");
        s1.getStudent();
        System.out.println("Payment details");
        s1.smsCheck();
        System.out.println("\n");
        System.out.println("show student details");
        c1.getStudent();
        System.out.println("Payment details");
        c1.smsCheck();
    }

}