package assignment3.interfaces.task1;

public class Bird implements CanFlyInterface{
    @Override
    public void fly() {
        System.out.println("Mozhet konejno");
    }

    @Override
    public void notfly() {
        System.out.println("Ne mozhet letat");
    }
}
