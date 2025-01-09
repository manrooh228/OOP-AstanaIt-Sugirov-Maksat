package assignment2;

public class task4 {
    public static int[] firstArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
    public static int[] secondArr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; 
    public static int[] resultArr = new int[firstArr.length + secondArr.length]; 

    public static void main(String[] args) {
        for (int i = 0; i < firstArr.length; i++) {
            resultArr[i] = firstArr[i];
        }

        for (int i = 0; i < secondArr.length; i++) {
            resultArr[firstArr.length + i] = secondArr[i];
        }

        for (int value : resultArr) {
            System.out.print(value + " ");
        }
    }
}
