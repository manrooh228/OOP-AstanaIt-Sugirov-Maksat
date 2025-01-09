package assignment2.assignment2functions;

public class task3 {
    // Переименуйте параметры метода printPersonInfo():
    // • * Имя в name;
    // • Фамилия в surname;
    // • Любимое блюдо в меню meal;
    // , чтобы функциональность программы не изменилась.
    // Оставьте имена переменных в методе main() без изменений.
    public static void main(String[] args) {
        String firstName = "Olga";
        String lastName = "Kipriyanovna";
        String favoriteDish = "Dumplings";
        printPersonInfo(firstName, lastName, favoriteDish);
    }
    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Brief Dossier:");
        System.out.println("Name: " + name);
        System.out.println("LastName: " + surname);
        System.out.println("Favorite dish: " + meal);
    }
}
