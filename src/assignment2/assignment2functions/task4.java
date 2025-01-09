package assignment2.assignment2functions;

public class task4 {
    // Метод create Crew() выводит должности и имена членов экипажа
    // космического корабля.
    // Чтобы избежать путаницы в методе, измените имена параметров createCrew()
    // , чтобы они соответствовали именам переменных, передаваемых методу:
    // • name1 в navigator
    // • имя 2 в pilot
    // • имя 3 для secondPilot
    // • имя 4 в flightEngineer
    // Результат выполнения программы не должен измениться.
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Gender";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
        System.out.println("The four to conquer space:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Co-pilot: " + secondPilot);
        System.out.println("Flight Engineer: " + flightEngineer);
    }
}
