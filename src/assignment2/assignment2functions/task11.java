package assignment2.assignment2functions;

public class task11 {
    // Метод print Sqrt(int[] array) должен вывести квадратный корень для каждого элемента
    // переданного массива.
    // Но этого не происходит из-за конфликта имен переменных. Исправьте имена переменных
    // , чтобы код компилировался.
    // В результате программа должна вывести соответствующую строку для каждого элемента массива в
    // консоли.
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String txt = "The square root of the number ";//renamed: elementSqrt -> txt
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(txt + element + " equals " + elementSqrt);
        }
    }
}
