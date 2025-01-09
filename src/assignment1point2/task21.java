package assignment1point2;

import java.util.Scanner;

public class task21 {
    public static void task21work() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("it’s cold outside");
        } else {
            System.out.println("it’s warm outside");
        }
        // scanner.close();37
    }
}
