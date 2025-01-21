package week03;

import java.util.Scanner;

public class Movie {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double runningTotal = 0;
        String day_of_the_week = "";
        int age = 0;

        while (age >= 0) {
            System.out.print("Enter your age (-1 to STOP): ");
            age = keyboard.nextInt();

            if (age != -1) {

                System.out.print("Enter the day of the week: ");
                day_of_the_week = keyboard.next();

                double price = 0;
                // check if day of the week is tuesday
                if (day_of_the_week.equalsIgnoreCase("tuesday")) {

                    price = 5;
                } else {
                    if (age < 18) {
                        price = 12.00;
                    } else if (age < 65) {
                        price = 14.75;
                    } else {
                        price = 13.25;
                    }
                }
                runningTotal += price;
                System.out.printf("Your movie ticket costs $%2.2f\n", price);
                System.out.printf("The value of total tickets sold is: $%2.2f\n", runningTotal);
            }
        }

        System.out.printf("\n\nTotal tickets sold during shift was: $%2.2f\n", runningTotal);

    }
}