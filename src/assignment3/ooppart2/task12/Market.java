package assignment3.ooppart2.task12;

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) { // Use the local parameter instead of the static field
            System.out.println("Bought 10 loaves");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }
}
