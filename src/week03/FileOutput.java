package week03;

import java.io.PrintWriter;

public class FileOutput {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String [] args) throws Exception {
        // Step 1: file the file
        String filename = "C:/temp/file.txt";

        // Step 2: open the file
        PrintWriter outputFile = new PrintWriter(filename);

        // Step 3: process the file
        outputFile.printf("writing to the file");
        outputFile.printf("writing to the file");
        outputFile.printf("\n\nwriting to the file\n\n");

        // Step 3: continue processing the file...
        int i;
        outputFile.printf( "%10s %10s\r\n", "Number", "Reverse" );
        for ( i = 0; i <= 10; i++ ) {
            outputFile.printf( "%10d %10d\r\n", i, (10-i) );
        }

        // Step 4: close the file
        outputFile.close();


    }
}