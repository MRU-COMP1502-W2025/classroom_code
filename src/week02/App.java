package week02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println((double)(5/2));
        System.out.println((int)(5.0/2.0));
        System.out.println((int)5.0/2.0);

        // System.out.println(5/2);
        
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the numerical grade: ");
            int grade = keyboard.nextInt();

            if  (grade < 50 ) {
                System.out.println("F");

            } else if (grade < 60) {
                System.out.println("D");

            } else if (grade < 70) {
                System.out.println("C");

            } else if (grade < 80) {
                System.out.println("B");

            } else {
                System.out.println("A");

            }

        }

        keyboard.close();
    }
}
