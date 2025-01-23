package assignment3.interfaces.task9;

import assignment3.interfaces.task9.Solution.CanFly;

public class FlyingObject implements CanFly {
    @Override
    public Double speed() {
        return 100.0;
    }

    @Override
    public Double speed(CanFly canFly) {
        return canFly.speed() + 50.0; 
    }
}
