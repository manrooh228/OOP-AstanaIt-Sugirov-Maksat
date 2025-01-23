package assignment3.interfaces.task8;

public class Solution {
    interface Person {
        boolean isAlive();
    }

    interface Presentable extends Person {
    }
    public static void main(String[] args) {
        Personss person = new Personss();
        System.out.println("Is that person alive: " + person.isAlive());
    }
}
