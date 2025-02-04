package week05;

import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputString = "";

        /* Type your code here. */
        while (!inputString.equals("q")) {
            System.out.println("Enter input string:");
            inputString = scnr.nextLine();
            String[] names;
            String firstWord;
            String secondWord;

            if (!inputString.equals("q")) {
                if (!inputString.contains(",")) {
                    System.out.println("Error: No comma in string.");
                } else {
                    names = inputString.split(",");
                    for (int i = 0; i < names.length; ++i) {
                        names[i] = names[i].trim();
                        // System.out.println(names[i]);
                    }
                    firstWord = names[0];
                    secondWord = names[1];

                    System.out.println("First word: " + firstWord);
                    System.out.println("Second word: " + secondWord);
                }
                System.out.println();
            }
        }
    }
}