package Basic.memorymanagement;

public class Employee {
    
    public static void main(String[] args) {
         
        InnerEmployee E = new InnerEmployee("Abhijit", 23);
        InnerEmployee S = new InnerEmployee("Sabeer", 25);
        InnerEmployee Su = new InnerEmployee("Subham", 34);
        E.show();
        S.show();
        Su.show();
        E.showNextId();
        S.showNextId();
        Su.showNextId();
        {
            InnerEmployee X = new InnerEmployee("Biswajit", 24);
            InnerEmployee Y = new InnerEmployee("Prasenjit", 26);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
            X = Y = null;
            System.gc();
           // System.runFinalization();
        }
        E.showNextId();
    }
}
/**
 * InnerEmployee
 */
class InnerEmployee {
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    public InnerEmployee(String name, int age) {
         this.name = name;
         this.age = age;
         this.ID = nextId++;
    }
    public void show(){
        System.out.println("Id :"+ ID + " Name :"+ name + " Age :" + age);
    }
    public void showNextId(){
        System.out.println("Next employee id will be : "+ nextId);
    } 

    protected void finalize(){
        --nextId;
    }
    
}
