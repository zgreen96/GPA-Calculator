/**
 * Created by greezj15 on 2/29/2016.
 */

import java.util.Scanner;

public class Lab5 {

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in); //imports scanner
        int numCourses = 0;                     //initialize number of courses
        System.out.println("GRADEBOOK\n");
        System.out.print("How many courses are you taking?  "); //asks for user input
        numCourses = scnr.nextInt();            //sets number of courses to user input
        System.out.println();                   //spacing
        String courseName = "";                 //initializing variables
        double creditHours = 0.0;
        int grade = 0;
        double gradeAccum = 0.0;
        double hoursAccum = 0.0;
        double gpa = 0.0;



        for (int i = 0; i < numCourses; i++) { //loop that asks information about each course
            System.out.print("Course Name :");
            courseName = scnr.next();           //gets course name via user input

            System.out.print("Credit Hours: ");
            creditHours = scnr.nextDouble();        //gets credit hours via user input
            hoursAccum += creditHours;              //hoursAccum is necessary for calculating total gpa

            System.out.print("Grade :");            //gets grade via user input
            grade = scnr.nextInt();


            if ((grade >= 93) && (grade <= 100)) {      //assigns grades to gpa number value
                System.out.println("Quality Points Earned: 4.00");
                gradeAccum += 4.00 * creditHours;       //gradeAccum is necessary to calculate total gpa
            }

            else if ((grade >= 90) && (grade <= 92)) {
                System.out.println("Quality Points Earned: 3.67");
                gradeAccum += 3.67 * creditHours;
            }

            else if ((grade >= 87) && (grade <= 89)) {
                System.out.println("Quality Points Earned: 3.33");
                gradeAccum += 3.33 * creditHours;
            }

            else if ((grade >= 83) && (grade <= 86)) {
                System.out.println("Quality Points Earned: 3.00");
                gradeAccum += 3.00 * creditHours;
            }

            else if ((grade >= 80) && (grade <= 82)) {
                System.out.println("Quality Points Earned: 2.67");
                gradeAccum += 2.67 * creditHours;
            }

            else if ((grade >= 77) && (grade <= 79)) {
                System.out.println("Quality Points Earned: 2.33");
                gradeAccum += 2.33 * creditHours;
            }

            else if ((grade >= 73) && (grade <= 76)) {
                System.out.println("Quality Points Earned: 2.00");
                gradeAccum += 2.00 * creditHours;
            }

            else if ((grade >= 70) && (grade <= 72)) {
                System.out.println("Quality Points Earned: 1.67");
                gradeAccum += 1.67 * creditHours;
            }

            else if ((grade >= 67) && (grade <= 69)) {
                System.out.println("Quality Points Earned: 1.33");
                gradeAccum += 1.33 * creditHours;
            }

            else if ((grade >= 63) && (grade <= 66)) {
                System.out.println("Quality Points Earned: 1.00");
                gradeAccum += 1.00 * creditHours;
            }

            else if ((grade >= 60) && (grade <= 62)) {
                System.out.println("Quality Points Earned: 0.67");
                gradeAccum += 0.67 * creditHours;
            }

            else if ((grade >= 87) && (grade <= 89)) {
                System.out.println("Quality Points Earned: 0.00");

            }

            System.out.println();
        }
        System.out.println();       //spacing
        System.out.println();
        gpa = gradeAccum / hoursAccum;       //calculates gpa
        String formatGPA = String.format("%4.2f", gpa);     //formats gpa to two decimal places;

        System.out.printf("GPA: %5s" , formatGPA); // prints gpa
    }
    return;
}
