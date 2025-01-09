package assignment1point2;

import java.util.Scanner;

public class task22 {
    public static void task22work() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }

    }
}
