package week01;

import java.util.Scanner;

public class Available {
    
    /** 
     * @param args[] asldkaslkdnas
     */
    public static void main(String args[]) {
        // declare variables needed for the program
        double limit = 0;
        double owing = 0;
        double available = 0;

        Scanner keyboard = new Scanner(System.in);

        // request credit limit from the user
        System.out.print("Enter credit limit: ");
        limit = keyboard.nextInt();

        // request the amount owing from the user
        System.out.print("Enter amount owing: ");
        owing = keyboard.nextDouble();

        // calculate the amount available, then print to screen
        available = limit - owing;
        System.out.println("Credit available is $" + available);

        keyboard.close();
    }
}