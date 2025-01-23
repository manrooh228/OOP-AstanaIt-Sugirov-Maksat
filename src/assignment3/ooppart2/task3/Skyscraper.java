package assignment3.ooppart2.task3;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("Business center with " + floorsCount + " floors is developed by " + developer + ".");
    }

    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
        System.out.println("Business center with " + floorsCount + " floors is developed by " + developer + ".");
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
    }
}
