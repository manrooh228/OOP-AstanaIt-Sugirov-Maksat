package assignment2.OOPpart1;

public class task3 {
    public class Vehicle {
        double maxSpeed;//base vehicle
    }
    
    public class Car extends Vehicle { //dannie dlya vseh car
        int wheelCount;
        double weight;
    }
    
    public class ElectricCar extends Car {
        int electricEnginePower;//dannie dlya vseh elect car
    }
}
