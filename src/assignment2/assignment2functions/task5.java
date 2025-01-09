package assignment2.assignment2functions;

public class task5 {
    // Давайте напишем утилиту для работы с массивами. Основная часть функционала готова: метод
    // printArray() выводит все элементы массива в консоль.
    // Нужно только реализовать метод reverseArray(). Он должен изменить
    // порядок элементов массива на обратный.
    // Метод должен работать только с массивами целочисленных значений (int[]).
    // Пример:
    // Если бы массив содержал элементы:
    // 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 0
    // затем, после вызова метода reverseArray(), он должен содержать:
    // 0, 9, 8, 7, 6, 5, 4, 3, 2, 1
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
