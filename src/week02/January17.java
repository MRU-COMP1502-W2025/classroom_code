package week02;

import java.io.File;
import java.util.Scanner;

public class January17 {
    public static void main(String[] args) throws Exception {
        //
        // This function will calculate the average of numbers from the keyboard
        //
        calculateAverageFromKeyboard();

        //
        // This function will calculate the average of numbers found in a file
        //
        calculateAverageFromFile();
    }

    /**
     * This function will read numbers from a keyboard and then calculate the average of those numbers
     * 
     */
    public static void calculateAverageFromKeyboard()  {
        System.out.print("Enter some numbers separated by a space:");
        // create an object of type Scanner that is connected to the keyboard
        Scanner keyboard = new Scanner(System.in);

        // read the first line entered up to the newline (\n) character
        String strInput = keyboard.nextLine();

        // call the function that will calculate the average
        double avg = calculateAverage(strInput, " ");
        // print the average
        System.out.println("The avg is: " + avg);
        // close the keyboard
        keyboard.close();        
    }

    /**
     * 
     * @throws Exception
     */
    public static void calculateAverageFromFile() throws Exception {
        // absolute file name location
        // File inputFile = new File("G:\\My Drive\\W24-COMP1502\\Week02\\InClassWednesday\\numbers.txt");

        // relative filename location
        File inputFile = new File("numbers.txt");

        // create a new scanner connected to the input file
        Scanner fileReader = new Scanner(inputFile);

        // read the first line in the input file
        String strInput = fileReader.nextLine();

        // call the function to calculate the average given a string of numbers separated by a space
        double avg = calculateAverage(strInput, " ");
        // print the average
        System.out.println("The avg is: " + avg);
        // close the connection with the file
        fileReader.close();
    }

    /**
     * This function will calculate the average of a series of numbers that are separated by a space
     * 
     * @param inputString - a string of numbers that are separated by a delimiter 
     * @param delimiter - what is being used to separate each number
     * 
     * @return - the average from the numbers provided in the <code>inputString</code>
     */
    public static double calculateAverage(String inputString, String delimiter) {
        // show what we are trying to process
        System.out.println(inputString);

        // split the input string using the provided delimiter
        String [] inputArray = inputString.split(delimiter);

        // accumulator loop pattern
        double sum = 0;
        // iterate through the loop and sum up the values of the numbers provided
        for(String numAsString : inputArray) {
            // System.out.println(numAsString);
            // Integer.valueOf(strInput);
            sum += Double.valueOf(numAsString);
        }

        // now calculate the average by dividing the sum by the length of the array
        double avg = (sum/inputArray.length);

        return avg;
    }
}