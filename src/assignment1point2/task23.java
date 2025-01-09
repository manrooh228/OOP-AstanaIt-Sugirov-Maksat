package assignment1point2;

import java.util.Scanner;

public class task23 {
    public static void task23work() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your body temperature: ");
        double temperature = scanner.nextDouble();

        boolean isHigh = temperature > 37.5;
        boolean isLow = temperature < 36.0;

        if (isHigh) {
            System.out.println("Your body temperature is high.");
        } else if (isLow) {
            System.out.println("Your body temperature is low.");
        } else {
            System.out.println("Your body temperature is normal.");
        }

    }
}
