package ReplitTasks;

import java.util.Scanner;

public class ClassScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable for first exam score
        System.out.println( " Please enter your fist exam score ");
        int firstExam= input.nextInt();

        // variable for second exam score
        System.out.println("Please enter your second exam score ");
        int secondExam= input.nextInt();

        // variable for third exam score
        System.out.println("Please enter your third exam score " );
        int thirdExam= input.nextInt();

        //variable for percentage of attendancy
        System.out.println(" What is your attendance percentage? ");
        int percentageOfAttendancy= input.nextInt();

        int requiredScore = 65;
        int studentAttent = 80;
        int average = (firstExam + secondExam + thirdExam)/3;


        // create boolean variable for result
        boolean result = average >= requiredScore && percentageOfAttendancy >= studentAttent;

        System.out.println(result);

    }
}
/*Write the code to check the student pass the class or not.
To be able to pass the class student need to have at least 65 score from the exams and student need to attend the at least 80 percent of all the classes.
To calculate the average score we need to take take 20 percent of first exam score and 30 percent of second exam score and 50 percent of third exam score. We are given variables for three exam scores and one variable for attendance to classes. If all conditions are met, print true at the end. If not, print false.
The values for firstExam, secondExam, thirdExam and percentage will automatically inserted.  For this exercise find out if student pass or not with a single universal equation for all 3 tests.
NOTE: If statement is NOT NEEDED for this question.
Example 1:
 first exam score : 60
 second exam score :65
enter third exam score: 70
attendance percentage:80
true

Example 2:
Please enter first exam score (1 - 100):
60
Please enter second exam score (1 - 100):
65
Please enter third exam score (1 - 100):
70
Please enter your attendance percentage:
70
false

Example 3:
Please enter first exam score (1 - 100):
50
Please enter second exam score (1 - 100):
40
Please enter third exam score (1 - 100):
30
Please enter your attendance percentage:
90
false


 */
