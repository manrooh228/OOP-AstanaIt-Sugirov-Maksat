package assignment2.assignment2arrays;

public class task17 {
    // Приведен двумерный массив символов. Вам необходимо заменить все внутренние элементы на дефис
    // (минус) в методе main.
    // Чтобы вывести содержимое массива на экран, используйте частный метод printArray().
    // Пример массива:
    // a b c d e f
    // g h i j k l
    // m n o p q r
    // s t u v w x
    // После запуска программы массив должен содержать:
    // а, б
    // , в, г, д
    // , е, ж, ж, ж, ж, ж, ж
    // , ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж, ж,
    // Требования:
    // • В методе main вы должны заменить все внутренние элементы массива символов
    // дефисами (смотрите пример в условии).

    public static char[][] arr = {
        {'a', 'b', 'c', 'd', 'e', 'f'},
        {'j', 'h', 'i', 'j', 'k', 'l'},
        {'m', 'n', 'o', 'p', 'q', 'r'},
        {'s', 't', 'u', 'v', 'w', 'x'}
    };

    public static void main(String[] args) {

        for (int i = 1; i < arr.length - 1; i++) { 
            for (int j = 1; j < arr[i].length - 1; j++) { 
                arr[i][j] = '-';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
