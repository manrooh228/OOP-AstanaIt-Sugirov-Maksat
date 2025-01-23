package assignment3.interfaces.task2;

import assignment3.interfaces.task2.Solution.CanMove;

public class Car implements CanMove{
    @Override
    public void move() {
        System.out.print("car moving");
        System.out.println("");
    }
}
