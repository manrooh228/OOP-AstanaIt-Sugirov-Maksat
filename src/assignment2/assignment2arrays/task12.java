package assignment2.assignment2arrays;

import java.util.Scanner;

public class task12 {
    // В классе Solution инициализируйте поле arr значением двумерного массива целых
    // чисел размером 2x3.
    // В методе main заполните этот массив целыми числами (кроме 0) и отобразите его на экране.
    // Требования:
    // • * Поле arr класса Solution должно быть инициализировано значением двумерного массива целых чисел размером 2x3.
    // • Этот массив должен быть заполнен любыми целыми числами, отличными от 0.
    // • Программе необходимо вывести элементы массива, каждый элемент в новой
    // строке.
    // Инициализация массива размером 2x3
    public static int[][] arr = new int[2][3];

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter 6 nums: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

     scn.close();
    }
}
