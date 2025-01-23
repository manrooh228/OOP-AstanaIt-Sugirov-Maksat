package assignment3.interfaces.task3;

import assignment3.interfaces.task3.Solution.CanRun;
import assignment3.interfaces.task3.Solution.CanSwim;

public class Human implements CanSwim, CanRun{
    @Override
    public void run() {
        System.out.print("Duck running"); System.out.println();
    }
    @Override
    public void swim() {
        System.out.print("Duck swimming"); System.out.println();
    }
}
