package homework3;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade in letter.");
        String grade = scan.nextLine();
        // Please don't change anything on lines above.
        if (grade.equalsIgnoreCase("A")) {

            System.out.println("4.0");
        }
        if (grade.equalsIgnoreCase("A-")) {

            System.out.println("3.7");
        }
        if (grade.equalsIgnoreCase("B+")) {

            System.out.println("3.3");
        }
        if (grade.equalsIgnoreCase("B")) {

            System.out.println("3.0");
        }
        if (grade.equalsIgnoreCase("B-")) {

            System.out.println("2.7");
        }
        if (grade.equalsIgnoreCase("C+")) {

            System.out.println("2.3");
        }
        if (grade.equalsIgnoreCase("C")) {

            System.out.println("2.0");
        }
        if (grade.equalsIgnoreCase("C-")) {

            System.out.println("1.7");
        }
        if (grade.equalsIgnoreCase("D+")) {

            System.out.println("1.3");
        }
        if (grade.equalsIgnoreCase("D")) {

            System.out.println("1.0");
        }
        if (grade.equalsIgnoreCase("F")) {

            System.out.println("0.0");
        }

    }
}

/*
Using scanner user is asked to enter grade letters.
The University uses a 4 point scale
for grades; these “quality” grades are as follows
4.0 = A,
3.7 = A-,
3.3 = B+,
3.0 = B,
2.7 = B-,
2.3 = C+,
2.0 = C,
1.7 = C-,
1.3 = D+,
 1.0 = D,
 F = 0.0
Print the number value matcing with this grade letters that user provided.
Example 1:
Input :
A
Output:
4.0
Example 2:
Input:
A-
Output:
3.7
NOTE:

 */