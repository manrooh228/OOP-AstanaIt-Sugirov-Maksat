package assignment2;

public class task1 {
    public static void main(String[] args) throws Exception {
        int[] intArr = new int[10];
        
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        double[] doubleArr = new double[10];

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = i * 1.0;
        }

        System.out.println("intArr:");
        for (int value : intArr) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("doubleArr:");
        for (double value : doubleArr) {
            System.out.print(value + " ");
        }
    }
}
