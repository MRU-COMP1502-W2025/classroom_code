package week02;

import java.util.Scanner;

public class Movie {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        String day_of_the_week = "";
        int age = 0;

        age = keyboard.nextInt();
        day_of_the_week = keyboard.next();

        char day_of_week = day_of_the_week.toLowerCase().charAt(0);

        double price = 0;
        // check if day of the week is tuesday
        if(day_of_week == 't' || day_of_the_week.equalsIgnoreCase("t")) {

            price = 5;
        } else {
            if(age < 18) {
                price = 12.00;
            } else if(age < 65) {
                price = 14.75;
            } else {
                price = 13.25;
            }
        }

        System.out.printf("Your movie ticket costs $%2.2f", price);
        keyboard.close();

    }
}