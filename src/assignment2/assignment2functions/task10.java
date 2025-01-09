package assignment2.assignment2functions;

public class task10 {
    // Эта программа должна выводить информацию о созданном массиве. Но из-за неправильно
    // размещенных статических модификаторов она не будет скомпилирована.
    // Исправьте эти ошибки. При необходимости добавьте статический модификатор.
    // Требования:
    // • Код должен скомпилироваться.
    // • Нам нужно добавить минимально необходимое количество статических модификаторов

    
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("In array: ");
        printArray(array);
        System.out.println("Minimum number: " + getMinValue(array));
        System.out.println("Maximum number: " + getMaxValue(array));
    }

    public static int getMaxValue(int[] array) { // +static
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) { 
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) { // +static
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
