package assignment2.assignment2arrays;

import java.util.Scanner;

public class task13 {
    // The Solution class contains a two-dimensional arr of integers (arr field) of size
    // 3x3. In the main method you need to fill this arr line by line with data from the
    // keyboard and display the maximum element of the arr.
    // Requirements:
    // • The program needs to read 9 numbers from the keyboard.
    // • The arr arr must be filled with numbers entered from the keyboard.
    // • In the program, you need to display the maximum element of an arr on the
    // screen.
    public static int[][] arr = new int[3][3];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 9 nums:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter num: ");
                arr[i][j] = scn.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max: " + max);

        scn.close();
    }
}
