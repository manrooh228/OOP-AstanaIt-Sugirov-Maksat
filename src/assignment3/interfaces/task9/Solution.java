package assignment3.interfaces.task9;

public class Solution {
    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }

    public static void main(String[] args) throws Exception {
        CanFly flyingObject = new FlyingObject();
        System.out.println("Speed of flying object: " + flyingObject.speed(flyingObject));
    }
}
