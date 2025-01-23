package assignment3.interfaces.task15;

public class Solution {
    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }
}
