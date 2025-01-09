package assignment1point2;

import java.util.Scanner;

public class task210 {
    public static void task210work() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("start: ");
        int start = scanner.nextInt();
        System.out.print("end: ");
        int end = scanner.nextInt();
        System.out.print("multiple: ");
        int multiple = scanner.nextInt();
        
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }

        // Display the sum
        System.out.println("sum: " + sum);

    }
}
