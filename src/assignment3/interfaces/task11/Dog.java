package assignment3.interfaces.task11;

import assignment3.interfaces.task11.Solution.Eat;
import assignment3.interfaces.task11.Solution.Movable;

public class Dog implements Eat, Movable {
    @Override
    public void move() {
        System.out.print("Dog can move");

    }
    @Override
    public void eat() {
        System.out.print("Dog can eat");
        
    }
}
