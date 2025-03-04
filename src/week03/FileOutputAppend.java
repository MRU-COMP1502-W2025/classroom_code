package week03;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileOutputAppend {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String [] args) throws Exception {
        // Step 1: file the file
        String filename = "file.txt";

        // Step 2: open the file
        // in order to append, you need to use FileWriter, and the second parameter
        // in the constructor will affect whether you are overwriting
        // or appending
        FileWriter fw = new FileWriter( filename, false );
        PrintWriter outputFile = new PrintWriter(fw);

        // Step 3: process the file
        outputFile.printf("appending to the file");

        // Step 3: continue processing the file...
        int i;
        outputFile.printf( "%10s %10s\r\n", "Number", "Reverse" );
        for ( i = 0; i <= 10; i++ ) {
            outputFile.printf( "%10d %10d\r\n", i, (10-i) );
        }

        // Step 4: close the file
        outputFile.flush(); 
        fw.close();
    }
}