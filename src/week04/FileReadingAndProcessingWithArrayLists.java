package week04;

import java.io.File;
import java.util.Scanner;

public class FileReadingAndProcessingWithArrayLists {
    public static void main(String[] args) throws Exception {
        // Step 1: find the file & check that it exists
        String filename = "src\\week04\\w4_grades_multi_line.txt";
        File inputFile = new File(filename);

        if (inputFile.exists()) {

            // Step 2: open the file
            Scanner fileReader = new Scanner(inputFile);

            // Step 3: processing of the file...
            while (fileReader.hasNext()) {
                //
                // print out to the screen what we read from the file
                //
                System.out.println(fileReader.nextLine());

                // System.out.print("grade: " +fileReader.next());
                
                // System.out.print(" course code: " +fileReader.next());

                // System.out.println(" name: " +fileReader.next());
            }

            // Step 4: close the file
            fileReader.close();
        }
    }
}