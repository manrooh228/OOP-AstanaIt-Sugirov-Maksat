package assignment3.interfaces.task3;

import assignment3.interfaces.task3.Solution.CanRun;

public class Car implements CanRun {
    @Override
    public void run() {
        System.out.print("Duck running"); System.out.println();
    }
}   
