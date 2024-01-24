package Basic.array;

public class arrayintilize {

    public static void main(String[] args) {

        Employee[] employees = { new Employee(10, "biswajit"), new Employee(11, "raman") };

        System.out.println(" Employee at index 0 "+ employees[0].getName());
        System.out.println(" Employee at index 1 "+ employees[1].getName());
    }
}

/**
 * Employee
 */
class Employee {

    private int id;
    private String name;


    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    
    public Employee(int id, String name) {
        //TODO Auto-generated constructor stub
        super();
        this.id = id;
        this.name = name;
    }


}