package assignment2.assignment2arrays;

public class task2 {
    // В методе main(String[]) вам нужно заполнить массив strings значениями. Если индекс
    // массива четный - присвойте значение "Even" (ноль - четное число), в противном
    // случае присвойте "Odd".
    // Вывод текста на консоль в тестировании не участвует.
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];
    public static void main(String[] args) throws Exception {
        for ( int i = 0; i < strings.length; i++) {
            if(i % 2 == 0){
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }
        System.out.println("");
        
        for(String value : strings) {
            System.out.print("value: ");
            System.out.println(value);
        }
    }
}
