package assignment2.assignment2functions;

public class task12 {
    // Программа должна вывести численность населения крупнейших городов мира и
    // сравнить их с крупнейшим городом - Токио. Но алгоритм программы немного нарушен.
    // Чтобы исправить ошибку, нужно заставить строку с выводом информации о крупнейшем
    // городе мира использовать статические переменные класса вместо аргументов локального метода.
    // При корректной работе программы вывод должен быть следующим:
    // Население Джакарты составляет 25,3 миллиона человек....
    // В то время как в самом густонаселенном городе Токио проживает 34,5 миллиона человек.


    public static String City = "Tokyo"; // city->City
    public static double Population = 34.5; //population->Population

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("The City of " + city + " has a population of " + population + " million.");
        System.out.println("While the most populous City " + City + " has a population of " + Population + " million.");
    }
}
