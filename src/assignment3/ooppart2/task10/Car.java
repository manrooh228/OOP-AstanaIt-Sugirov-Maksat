package assignment3.ooppart2.task10;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int result = 17; // Non-zero initial value
        result = 31 * result + (model != null ? model.hashCode() : 0); // Include model's hashCode
        result = 31 * result + year; // Include year
        return result;
    }

    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);

        System.out.println(ferrari.hashCode() == ferrari1.hashCode()); // true
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode()); // true
        System.out.println(ferrari.hashCode() == ferrari1.hashCode()); // true
        System.out.println(bugatti.hashCode() == bugatti1.hashCode()); // true
        System.out.println(bugatti.hashCode() == lamborghini.hashCode()); // false
        System.out.println(lamborghini.hashCode() == ferrari.hashCode()); // false
    }
}
