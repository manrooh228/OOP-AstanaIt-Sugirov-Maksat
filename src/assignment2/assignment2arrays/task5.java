package assignment2.assignment2arrays;

import java.util.Scanner;

public class task5 {
    // 1. Считывает целое число N из консоли.
    // 2. Если прочитанное число N больше 0, программа дополнительно считывает
    // целые числа, количество которых равно N.
    // 3. Выведите считанные числа на консоль, если N нечетное - в
    // порядке ввода, в противном случае - в обратном порядке.
    // Выведите каждое число в новой строке. Число N выводить не обязательно.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        if (N > 0) {
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scn.nextInt();
            }

            if (N % 2 != 0) {
                for (int i = 0; i < N; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }

        scn.close();
    }
}
