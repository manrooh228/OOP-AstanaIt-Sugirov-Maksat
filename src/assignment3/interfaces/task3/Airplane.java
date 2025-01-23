package assignment3.interfaces.task3;

import assignment3.interfaces.task3.Solution.CanFly;

public class Airplane implements CanFly {
    @Override
    public void fly() {
        System.out.print("Duck flying"); System.out.println();
    }
}
