package assignment3.interfaces.task11;

import assignment3.interfaces.task11.Solution.Eat;
import assignment3.interfaces.task11.Solution.Edible;
import assignment3.interfaces.task11.Solution.Movable;

public class Cat implements Movable, Eat, Edible{
    @Override
    public void move() {
        System.out.print("Cat can move");
    }
    @Override
    public void beEaten() {
        System.out.print("Cat can be eaten");
    }
    @Override 
    public void eat() {
        System.out.print("Cat can eat");
    }
}
