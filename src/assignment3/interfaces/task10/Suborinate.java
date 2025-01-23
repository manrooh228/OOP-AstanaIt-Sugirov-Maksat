package assignment3.interfaces.task10;

import assignment3.interfaces.task10.Solution.Person;
import assignment3.interfaces.task10.Solution.Secretary;

public class Suborinate implements Secretary {
    @Override
    public void use(Person person) {
        person.startToWork();
    }

    @Override
    public void startToWork() {
        System.out.println("Suborinate worl");
    }
}
