package basic.Abstract_Interface.Inheritance;

public class hasainheritance {
    int id;
    String name;
    Address address;

    public hasainheritance(int id, String name, Address address){
        this.id= id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " "+ name);
        System.out.println(address.city +" "+ address.state +" "+ address.country);
    }

    public static void main(String[] args) {
        
        Address address1 = new Address("jajapur", "Odisha", "India");
        Address address2 = new Address("bhubaneswar", "Odisha", "India");
        
        hasainheritance emp = new hasainheritance(11, "Biswajit",address1);
        hasainheritance emp2 = new hasainheritance(12, "Anand",address2);
           
        emp.display();
        emp2.display();
    }
}

