package week04;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadingAndProcessingWithArrayLists {
    public static void main(String[] args) throws Exception {

        FileReadingAndProcessingWithArrayLists app = new FileReadingAndProcessingWithArrayLists();
        app.run();
    }

    public void run() throws Exception {

        // Step 1: find the file & check that it exists
        String filename = "src\\week04\\w4_grades_multi_line.txt";
        File inputFile = new File(filename);

        ArrayList<Double> listOfGrades = new ArrayList<Double>();
        ArrayList<String> listOfStudents = new ArrayList<String>();
        ArrayList<String> listOfCourses = new ArrayList<String>();

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
                // add grade to the array list
                listOfGrades.add(grade);
                // read & discard the end-of-line character '\n'
                fileReader.nextLine();

                // get the course
                String course = fileReader.next();
                // add course to the array list of courses
                listOfCourses.add(course);
                // read & discard the end-of-line character '\n'
                fileReader.nextLine();

                // get the name
                String studentName = fileReader.nextLine();
                // add student name to the array list of students
                listOfStudents.add(studentName);
            }
            System.out.println("list of grades: " + listOfGrades);
            System.out.println("list of students: " + listOfStudents);
            System.out.println("list of courses: " + listOfCourses);

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