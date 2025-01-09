package assignment1point2;

public class task27 {
    public static void task27work() {
        int height = 5;
        int width = 10;
        int row = 0;

        while (row < height) {
            int col = 0;

            while (col < width) {
                System.out.print("Q");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}
