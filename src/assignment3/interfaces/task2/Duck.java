package assignment3.interfaces.task2;

import assignment3.interfaces.task2.Solution.CanFly;
import assignment3.interfaces.task2.Solution.CanEat;
import assignment3.interfaces.task2.Solution.CanMove;

public class Duck implements CanEat, CanMove, CanFly {
    @Override
    public void eat() {
        System.out.print("duck eating");
        System.out.println("");
    }

    @Override
    public void move() {
        System.out.print("duck moving");
        System.out.println("");
    }

    @Override 
    public void fly() {
        System.out.print("duck flying");
        System.out.println("");
        
    }
}
