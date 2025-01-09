package assignment2.assignment2functions;

public class task6 {
    // Было бы неплохо иметь один метод для решения разных задач. У вас есть
    // возможность написать один.
    // Создайте
    // еще 9 универсальных методов Method(). Всего у вас должно быть 10 из них.
    // Вы можете придумать параметры, которые они должны принимать.
    // Требования:
    // • Программа должна содержать 10 методов с именем universalMethod.
    public static void main(String[] args) {
        System.out.println(universalMethod(5));
        System.out.println(universalMethod("s"));
        System.out.println(universalMethod(0.1));
        System.out.println(universalMethod(new int[]{1, 2, 3}));
        System.out.println(universalMethod(new double[]{1.1, 2.2, 3.3}));
        System.out.println(universalMethod(true));
        System.out.println(universalMethod('A'));
        System.out.println(universalMethod(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(universalMethod(3, 4));
        System.out.println(universalMethod("Concatenate", "Strings"));
    }

    public static int universalMethod(int num) {
        return 1;
    }

    public static int universalMethod(String str) {
        return 2;
    }

    public static int universalMethod(double d) {
        return 3;
    }

    public static int universalMethod(int[] array) {
        return 4;
    }

    public static int universalMethod(double[] arr) {
        return 5;
    }

    public static int universalMethod(boolean bool) {
        return 6;
    }

    public static int universalMethod(char ch) {
        return 7;
    }

    public static int universalMethod(int[][] arr) {
        return 8;
    }

    public static int universalMethod(int a, int b) {
        return 9;
    }

    public static int universalMethod(String str1, String str2) {
        return 10;
    }
}
