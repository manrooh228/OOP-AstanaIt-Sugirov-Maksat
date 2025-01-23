package assignment3.interfaces.task3;

public class Solution {
    public interface CanFly {
        public void fly();
    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
        duck.run();
        
    }
}
