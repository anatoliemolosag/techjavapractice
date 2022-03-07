package ReplitTasks;

import java.util.Scanner;

public class MinutsToYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes =input.nextInt();

        int minutesInYear = 60*24*365;
        int years = minutes/minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int minutesInDay = 60 * 24;
        int days = remainingMinutes / minutesInDay;


        System.out.println(minutes + " minutes is " + years + " years and " + days + " days.");

    }
}

/*CONVERTING MINUTES TO YEARS
In this task we are given a variable minutes and we have to convert it to years, months, days and print exactly like
output shown below and ALL coding will be ON Main.java CLASS.

NOTHING NEEDS TO BE DONE ON DoNotChange.java class.
There is a minutes variable created in Main.java class and assign with the value.
Yes, we cannot see the value of the minutes variable but that is not important.
We should apply our logic with just using just the name of the variable which is minutes. We don't need to know value of the minutes variable as long as java knows.
NOTE: IMPORTANT THING IN THIS TASK IS NOT WORRYING ABOUT VALUE AND APPLYING LOGIC WITH JUST USING NAME OF THE VARIABLE.
      PLEASE DO NOT LOOK AT ANYTHING ON DoNotChange CLASS BECAUSE WE DON'T NEED IT.

Our output MUST be like down.

Test DataInput the number of minutes:
3456789
Expected OUTPUT : 3456789 minutes is 6 years and 210 days


Please do not submit the homework if your tests don't pass.

 */