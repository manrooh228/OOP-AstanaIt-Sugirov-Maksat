package assignment3.interfaces.task6;

public class Screen implements Selectable, Updatable{
    @Override
    public void refresh () {
        System.out.print("Screen refreshed");
        System.out.println();
    }

    @Override
    public void select() {
        System.out.print("Screen selected");
        System.out.println();
    }
}
