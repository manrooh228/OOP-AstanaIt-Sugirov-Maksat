package assignment2.assignment2arrays;

public class task11 {
    // В методе main(String[]) отобразите все числа в трехмерном массиве MultiArray.
    // Требования:
    // • Класс Solution должен иметь общедоступную статическую переменную MultiArray типа
    // int[][][][].
    // • В методе main(String[]) отобразите все числа из MultiArray.
    public static int[][][][] multiArray = new int[][][][]{
        {
            {{4, 8, 15}, {16}}, 
            {{23, 42}, {}},
            {{1}, {2}, {3}, {4, 5}}
        }
    };
    public static void main(String[] args) {
        for (int[][][] r1 : multiArray) {
            for (int[][] r2 : r1) {
                for (int[] r3 : r2) {
                    for (int num : r3) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
