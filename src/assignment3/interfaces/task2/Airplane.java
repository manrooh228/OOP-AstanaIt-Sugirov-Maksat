package assignment3.interfaces.task2;

import assignment3.interfaces.task2.Solution.CanFly;
import assignment3.interfaces.task2.Solution.CanMove;

public class Airplane implements CanMove, CanFly{
    @Override
    public void move() {
        System.out.print("airplane moving");
        System.out.println("");
    }

    @Override
    public void fly() {
        System.out.print("airplane flying");
        System.out.println("");
    }
}
