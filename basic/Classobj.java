package basic;

public class Classobj {
    
    int age;
    String name;
    String gender;
    String address;
    double salary;

    public String getInfo() {
       return(name +" is "+age+"years old and he is from"+address+". His salary is "+salary);
    } 

    public static void main(String[] args) {
        Classobj tipun = new Classobj();
        tipun.age = 23;
        tipun.name = "biswajit";
        tipun.address = "meduakul";
        tipun.salary = 30000.00;
        System.out.println(tipun.getInfo());

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
