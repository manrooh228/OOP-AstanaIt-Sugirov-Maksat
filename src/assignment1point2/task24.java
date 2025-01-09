package assignment1point2;

import java.util.Scanner;

public class task24 {
    public static void task24work() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
        
                if (age < 20 || age > 60) {
                    System.out.println("You don’t have to work.");
                }

                scanner.close();
    }
}
