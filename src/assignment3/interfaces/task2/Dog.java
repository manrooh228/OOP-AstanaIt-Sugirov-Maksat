package assignment3.interfaces.task2;

import assignment3.interfaces.task2.Solution.CanEat;
import assignment3.interfaces.task2.Solution.CanMove;

public class Dog implements CanEat, CanMove{
    @Override
    public void move() {
        System.out.print("dog moving");
        System.out.println("");
    }
    
    @Override
    public void eat() {
        System.out.print("dog eating");
        System.out.println("");
    }
}
