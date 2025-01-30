package week04;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadingAndProcessingWithListOfList {
    public static void main(String[] args) throws Exception {

        FileReadingAndProcessingWithListOfList app = new FileReadingAndProcessingWithListOfList();
        app.run();
    }

    public void run() throws Exception {

        // Step 1: find the file & check that it exists
        String filename = "src\\week04\\w4_grades_one_line.txt";
        File inputFile = new File(filename);

        ArrayList<ArrayList<String>> listOfStudents = new ArrayList<>();

        if (inputFile.exists()) {

            // Step 2: open the file
            Scanner fileReader = new Scanner(inputFile);

            // Step 3: processing of the file...
            while (fileReader.hasNext()) {
                // declare a new array list to hold strings
                ArrayList<String> line = new ArrayList<>();

                // read a line from the file
                String lineFromFile = fileReader.nextLine();

                // this is one way to separate a line of input into
                // separate chunks based on the appearance of a ' '
                String[] lineTokens = lineFromFile.split(" ");

                // go through the array of tokens and store them into the
                // array list
                for (int i = 0; i < lineTokens.length; ++i) {
                    line.add(lineTokens[i]);
                }
                // add the list of Strings to our larger list
                listOfStudents.add(line);
            }
            System.out.println("list of students: ");
            for (ArrayList <String> student : listOfStudents) {
                System.out.println(student);
            }
            // Step 4: close the file
            fileReader.close();

            double maxGrade = findMaximumGrade(listOfStudents);
            System.out.println("The maximum grade is: " +maxGrade);
        }
    }

    /**
     * 
     * @param gradeList - a list of grades to be processed
     * @return the highest grade from the list
     */
    public double findMaximumGrade(ArrayList<ArrayList<String>> studentList) {
        System.out.println("\n\nfindMaximumGrade");
        double maxGrade = -1;
        //
        // for each loop is a read-only loop
        // this loop will take us through the larger list of students
        // 
        for (ArrayList<String> student : studentList) {
            System.out.println("student data: " +student);
            //
            // this loop will take us through all the records for a specific student
            //
            for(int i=0; i < student.size(); ++i) {
                System.out.println("\t" +student.get(i));
            }

            // given the structure of this list, we 'know' that grades are found at index 0
            double grade = Double.valueOf(student.get(0));

            // this logic does not change...
            if(grade > maxGrade) {
                maxGrade = grade;
            }
        }

        return maxGrade;
    }
}