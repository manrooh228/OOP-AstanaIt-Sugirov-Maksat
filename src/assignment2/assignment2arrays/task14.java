package assignment2.assignment2arrays;

import java.util.Scanner;

public class task14 {
    // Класс Solution содержит двумерный массив целых чисел (поле arr) размером
    // 3x3. В основном методе вам нужно построчно заполнить этот массив данными с
    // клавиатуры, вычислить сумму элементов в каждом столбце и в каждой строке и отобразить
    // наименьшую из этих сумм на экране.
    // Требования:
    // • Программе необходимо считать 9 цифр с клавиатуры.
    // • Массив arr должен быть заполнен числами, введенными с клавиатуры.
    // • В программе необходимо отобразить минимальную сумму элементов в строке или
    // столбце.

    public static int[][] arr = new int[3][3];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 9 nums:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter num: ");
                arr[i][j] = scn.nextInt();
            }
        }

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min: " + min);

        scn.close();
    }
}
