package ReplitTasks;

import java.util.Scanner;

public class CapacityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter max capacity of tickets ");
        int maxCapacity= input.nextInt();

        System.out.println("Please enter sold tickets ") ;
        int soldTickets = input.nextInt();


        boolean result = soldTickets < maxCapacity;

        System.out.println(result);

    }
}
/*Create the application to print true if there is enough space for NBA game and print false if there is no ticket for the game. To be able to calculate the result you need to make sure max capacity of the stadium is more than sold tickets.
The values for all 3 test will automatically be inserted on the lines 'int maxCapacity = (value) and int soldTickets=value'.
NOTE: If statement is NOT needed for this question.
Example 1:
max capacity: 25
 number of sold tickets: 20
true

Example 2:
 max capacity: 18
 number of sold tickets: 20
false

Example 3:
Please enter max capacity: 16
Please enter number of sold tickets: 15
true

 */
