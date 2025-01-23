package assignment3.interfaces.task2;

public class Solution {
    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.move();
        duck.eat();
        duck.fly();
    }
}
