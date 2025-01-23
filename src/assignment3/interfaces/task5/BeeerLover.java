package assignment3.interfaces.task5;

public class BeeerLover implements Alcoholic { 
    @Override
    public void askForMore(String message) {
        System.out.println(message);
    }

    @Override
    public void sayThankYou() {
        System.out.println("Thank you, poka vsem mujiki");
    }

    @Override
    public boolean isReadyToGoHome() {
        return READY_TO_GO_HOME;
    }

    @Override
    public void sleepOnTheFloor() {
        System.out.println("Alchoholic sleeping on the floor");
    }
}
