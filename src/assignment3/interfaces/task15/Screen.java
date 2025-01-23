package assignment3.interfaces.task15;

import assignment3.interfaces.task15.Solution.Updatable;

public class Screen implements Updatable {
    @Override
    public void onSelect() {
        System.out.println("Selectable: onSelect method executed.");
    }

    @Override
    public void refresh() {
        System.out.println("Updatable: refresh method executed.");
    }
}

