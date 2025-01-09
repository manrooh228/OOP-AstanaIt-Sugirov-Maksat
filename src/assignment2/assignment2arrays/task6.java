package assignment2.assignment2arrays;

import java.util.Scanner;

public class task6 {
    // Для выполнения этого задания вам необходимо:
    // 1. Ввести число N с клавиатуры.
    // 2. Считайте N целых чисел и заполните ими массив array.
    // 3. Найдите максимальное число элементов массива.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        scn.close();
    }
}
