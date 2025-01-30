package week04;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadingAndProcessing {
    public static void main(String[] args) throws Exception {

        FileReadingAndProcessing app = new FileReadingAndProcessing();
        app.run();
    }

    public void run() throws Exception {

        // Step 1: find the file & check that it exists
        String filename = "src\\week04\\w4_grades_multi_line.txt";
        File inputFile = new File(filename);

        // declare some variables for processing
        double maxGrade = -1;
        String maxStudentCourse = "";
        String maxStudentName = "";

        double sumOfGrades = 0;
        int studentCount = 0;

        ArrayList<Double> listOfGrades = new ArrayList<Double>();

        if (inputFile.exists()) {

            // Step 2: open the file
            Scanner fileReader = new Scanner(inputFile);

            // Step 3: processing of the file...
            while (fileReader.hasNext()) {
                //
                // print out to the screen what we read from the file
                //
                // get the grade
                double grade = fileReader.nextDouble();
                listOfGrades.add(grade);
                fileReader.nextLine();

                // get the course
                String course = fileReader.next();
                fileReader.nextLine();

                // get the name
                String studentName = fileReader.nextLine();

                sumOfGrades += grade;
                studentCount += 1;

                // check to see if this grade is the biggest one that we have seen
                if (grade > maxGrade) {
                    maxGrade = grade;
                    maxStudentCourse = course;
                    maxStudentName = studentName;
                }

                // System.out.println(grade + " " + course + " " + studentName);
            }
            System.out.println(maxGrade + " " + maxStudentCourse + " " + maxStudentName);
            System.out.println("The average is: " + sumOfGrades / studentCount);

            System.out.println("PRE: " + listOfGrades);
            double maximuGrade = findMaximumGrade(listOfGrades);
            System.out.println("The max grade is: " + maximuGrade);
            System.out.println("POST: " + listOfGrades);

            // Step 4: close the file
            fileReader.close();
        }
    }

    /**
     * 
     * @param gradeList - a list of grades to be processed
     * @return the highest grade from the list
     */
    public double findMaximumGrade(ArrayList<Double> gradeList) {
        double maxGrade = -1;
        // for each loop is a read-only loop
        for (Double grade : gradeList) {
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }

        // in this for loop we can change the values of
        // what is stored in the ArrayList
        for (int i = 0; i < gradeList.size(); ++i) {
            // change the value of all grades to 100
            gradeList.set(i, Double.valueOf(100));
        }
        return maxGrade;
    }
}