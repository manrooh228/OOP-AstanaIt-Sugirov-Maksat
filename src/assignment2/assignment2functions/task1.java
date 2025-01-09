package assignment2.assignment2functions;

public class task1 {
    // Создайте общедоступный статический метод void print Hydrogen Info(), который должен печатать все строки
    // о водороде.
    // Также создайте общедоступный статический метод void printJavaInfo(), который должен печатать все строки о
    // Остров Ява.
    // Наконец, в методе main() вызовите эти два метода. 
    // Общий вывод в консоли не должен измениться.
    public static void main(String[] args) {
        hydr();
        jav();
    }
    public static void hydr() {
        System.out.println("Hydrogen is the lightest and most abundant element in the universe.");
        System.out.println("It is the primary building block of the universe, forming stars and galaxies.");
        System.out.println("Hydrogen is a key component in the process of nuclear fusion.");
        System.out.println("It is a colorless, odorless, and highly flammable gas.");
    }

    public static void jav() {
        System.out.println("Java is a high-level, class-based, object-oriented programming language.");
        System.out.println("It was developed by Sun Microsystems and later acquired by Oracle Corporation.");
        System.out.println("Java is used to develop applications for a wide range of platforms.");
        System.out.println("It is known for its portability across different platforms, thanks to the Java Virtual Machine (JVM).");
    }
}
