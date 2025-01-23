package assignment3.interfaces.task3;

import assignment3.interfaces.task3.Solution.CanFly;
import assignment3.interfaces.task3.Solution.CanRun;
import assignment3.interfaces.task3.Solution.CanSwim;

public class Duck implements CanFly, CanSwim, CanRun{
    @Override
    public void fly() {
        System.out.print("Duck flying"); System.out.println();
    }
    @Override
    public void run() {
        System.out.print("Duck running"); System.out.println();
    }
    @Override
    public void swim() {
        System.out.print("Duck swimming"); System.out.println();
    }
}
