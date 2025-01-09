package assignment2.assignment2arrays;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        // В этом задании вам необходимо:
        // 1. Прочитать 6 строк и заполнить ими массив strings.
        // 2. Удалить повторяющиеся строки из массива strings, заменив их
        // на null (значения null не должны быть "нулевыми" строками).
        // Примеры.
        // 1. Массив после прочтения строк:
        // {"Hello", "Привет", "Мир", "Java", "Задачи", "Мир"}
        // Массив после удаления повторяющихся строк:
        // {null, null, null, null, "Java", "Задачи", null}
        // Требования:
        // • В методе main(String[]) считайте 6 строк с клавиатуры и заполняйте
        // ими массив strings.
        // • В методе main(String[]) удалите (замените string на null) элементы из
        // массив strings с идентичными строками.

        
        Scanner scn = new Scanner(System.in);
        String[] strArr = new String[6];
        
        for (int i = 0; i < 6; i++) {
            strArr[i] = scn.nextLine();
        }

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == null) continue;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] != null && strArr[i].equals(strArr[j])) {
                    strArr[j] = null;
                    strArr[i] = null;
                }
            }
        }
        for (String s : strArr) {
            System.out.println(s);
        }

        scn.close();
    }
}
