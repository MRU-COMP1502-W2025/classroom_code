package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        System.out.println("end of the semester...");

        Scanner kbd = new Scanner("Hello World");
        while (kbd.hasNext()) {
            System.out.println(kbd.next());
        }
        // System.out.println(kbd.next());
        kbd.close();

        File inputFile = new File("C:/temp/doesnotexist.txt");
        try {
            Scanner fileReader = new Scanner(inputFile);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.next());
            }
            fileReader.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        System.out.println("code after the try-catch...");
    }
}