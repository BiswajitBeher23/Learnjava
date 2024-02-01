package basic.Abstract_Interface.Inheritance;

class Employee {
    float salary = 40000;
}

public class isinheritance extends Employee {

    int bonus = 10000;

    public static void main(String[] args) {

        isinheritance emp = new isinheritance();
        System.out.println("Employee salary is " + emp.salary);
        System.out.println("Bonus of employee is " + emp.bonus);

    }

}
