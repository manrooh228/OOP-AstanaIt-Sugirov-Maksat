package assignment1point2;

import java.util.Scanner;

public class task26 {
    public static void task26work() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter an int or 'ENTER' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("ENTER")) {
                break;
            }   
            
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("ERROR");
            }
        }

        System.out.println("total sum: " + sum);
    }
}
