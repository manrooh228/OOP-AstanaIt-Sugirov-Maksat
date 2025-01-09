package assignment2.assignment2arrays;

public class task3 {
    // Реализуйте метод main(String[]), который изменяет знак элемента массива
    // на противоположный знак, если значение этого элемента является четным.
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 == 0) {
                array[i] = -array[i];
                System.out.println(array[i]);
            } else {
                System.out.println(array[i]);
            }
        }
        
    }
}
