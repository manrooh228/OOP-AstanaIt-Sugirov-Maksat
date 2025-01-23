package assignment3.interfaces.task11;

import assignment3.interfaces.task11.Solution.Edible;
import assignment3.interfaces.task11.Solution.Movable;

public class Mouse implements Movable, Edible {
    @Override
    public void move() {
        System.out.print("Mouse can move");
    }
    @Override
    public void beEaten() {
        System.out.print("Mouse can be eaten");
    }
}
