package assignment3.interfaces.task6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Screen scr = new Screen();
        try (Scanner scn = new Scanner(System.in)) {
            while(true) {
                System.out.println("1. Select Screen");
                System.out.println("2. Refresh screen");
                System.out.print("Select your deistvie: ");

                int deistvie = scn.nextInt();
                if(deistvie == 1) {
                    scr.select();
                } else if(deistvie == 2) {
                    scr.refresh();
                } else {
                    System.out.println("Invalid selection");
                }
                
            }
        }
    }
}
