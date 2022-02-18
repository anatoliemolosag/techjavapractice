package firstPractice.variables;

public class VariablePractice {
    public static void main(String[] args){

        // declaring variables
        int yellowApples = 4;
        int greenApples = 5;
        int oranges = 1;
        //int yellowApple = 2 ; you cannot create a new variable by using same name
        //but you can reassign it

        System.out.println(yellowApples+greenApples+oranges);

        int fruits = yellowApples+greenApples+oranges ;
        System.out.println(fruits);

        System.out.println(yellowApples);
        yellowApples = 3;
        System.out.println(yellowApples);

        /* yellow apples are 2 dollars each, green apple are 3 dollars and oranges are 5 each ,
        create variables to represent these cost of each fruit and calculate total cost of fruits and
        print it
         */

        int yellowApplecost = 2 ;
        int greenApplescost = 3 ;
        int orangecost = 5 ;

        System.out.println("$" + (yellowApples * yellowApplecost+greenApples * greenApplescost + oranges * orangecost));


        int totalCost = (yellowApples *yellowApplecost +greenApples*greenApplescost+oranges*orangecost);
        System.out.println("total cost of fruits is $"+ totalCost);
    }
}