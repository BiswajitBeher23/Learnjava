package Keywords;

class Vehicle {
    int maxspeed = 120;

    void display(){
        System.out.println("Car is running at 60 km/hr.");
    }

    Vehicle(){
        System.out.println("Car company is TATA");
    }
}

class Car extends Vehicle {

    int maxspeed =  180;

    void display() {
        System.out.println("Car maxspeed is "+ super.maxspeed+ " km/hr. Car can go last maximum speed upto "+maxspeed+"km/hr.");
    }

    Car(){
        super();
    }

    void message(){
        super.display();
        display();
    }
}

public class superkeyword {
public static void main(String[] args) {
    Car tata = new Car();
    tata.message();
}    
}
