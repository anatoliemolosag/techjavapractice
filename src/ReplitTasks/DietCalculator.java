package ReplitTasks;

import java.util.Scanner;

public class DietCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a variable to store steps
        System.out.println("Enter daily steps per day");
        int steps = input.nextInt();
        int daylySteps = 10000;

        //a variable to store miles.
        System.out.println("Enter total miles per day");
        double miles = input.nextDouble();
        double daylyMiles = 4.0;

        //a variable to store calory
        System.out.println("Enter daily calories taken");
        int dailyCaloryTaken = input.nextInt();
        int dailyCalories = 1500;

        // create a variable for result
        boolean result = miles >=daylyMiles && dailyCaloryTaken <= dailyCalories || steps >=daylySteps;

        // print out the result (true/false)
        System.out.println("Is vera able to lose 10kg in one month? " + result);

    }}

/*Veera wants to lose 10 pounds in one month. There are multiple conditions to lose 10 pounds in a month. Veera needs to walk 10000 steps daily OR needs to run at least 4 miles a day and ADDITION to those Veera needs to eat less than 1500 calories daily. Create the application that calculate the given parameter and will print the true if Veera is able to lose 10 kg in one month.
The values for daily steps , daily calory and milest will automatically be inserted on the lines . For this exercise calculate the given parameters are enough for losing weight or not. If yes, print true, otherwise print false.
NOTE : No need for using if statement.
Please look examples carefully.
Example 1:
Daily Steps:
9000
Daily Miles:
3.6
Daily calories:
2000
false

Example 2:
Daily Steps:
10000
Daily Miles:
1.9
Daily calories:
1500
false


Example 2:
Daily Steps:
9000
Daily Miles:
4.5
Daily calories:
1450
true


 */
