package assignment3.interfaces.task10;

import assignment3.interfaces.task10.Solution.Boss;
import assignment3.interfaces.task10.Solution.Person;
import assignment3.interfaces.task10.Solution.Secretary;

public class Manager implements Secretary, Boss{
    @Override
    public void use(Person person) {
        person.startToWork();
    }

    @Override
    public void startToWork() {
        System.out.println("Manager working");
    }

    @Override
    public boolean inspiresOthersToWork() {
        System.out.println("Manager inspires");
        return true; 
    }
}
