package assignment2.assignment2arrays;

import java.util.Scanner;

public class task15 {
    // Класс Solution содержит двумерный массив целых чисел (поле array) размером 3x3. Необходимо
    // :
    // • построчно заполнять этот массив числами с клавиатуры;
    // • перевернуть массив относительно главной диагонали (главная диагональ обладает свойством i == j
    // );
    // • отобразить перевернутый массив на экране, как в примере - каждую строку отдельно, элементы
    // в строке разделяются пробелом.
    // Пример переворачивания массива.
    // Исходный массив:
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // Массив перевернут относительно главной диагонали:
    // 1 4 7
    // 2 5 8
    // 3 6 9
    // Требования:
    // • Программе необходимо считать 9 чисел с клавиатуры.
    // • Массив array должен быть перевернут относительно главной диагонали.
    // • В программе необходимо вывести элементы массива в соответствии с
    // условием.


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

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
