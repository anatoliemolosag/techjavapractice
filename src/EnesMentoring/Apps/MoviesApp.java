package EnesMentoring.Apps;

import java.util.Scanner;

public class MoviesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.println("      Welcome to Batch12 Movie Store         ");
        System.out.println("*********************************************");
        System.out.println(" ");
        System.out.println("What kind of movie would you like to watch today?");
        System.out.println("Action or Drama : ");
        String chosenItem = input.nextLine().toLowerCase().trim();
        if (chosenItem.equals("action")||chosenItem.equals("drama")) {
            if (chosenItem.equals("action")) {
                System.out.println("Welcome to action movie ");
                System.out.println("Please choose a movie");
                System.out.println("john wick, batman, gladiator");
                String actionMovieChoose = input.nextLine().trim().toLowerCase();
                if (actionMovieChoose.equals("john wick")) {
                    System.out.println("John wick was added");
                    System.out.println("7.99");
                } else if (actionMovieChoose.equals("batman")) {
                    System.out.println("batman was added");
                    System.out.println("9.99");
                } else if (actionMovieChoose.equals("gladiator")) {
                    System.out.println("gladiator");
                    System.out.println("6.99");
                } else {
                    System.out.println("We can't find your movie. Please select another one");
                }
            }
            if (chosenItem.equals("drama")) {
                System.out.println("Welcome to drama movie ");
                System.out.println("Please choose a movie");
                System.out.println("titanic, godfather, braveHeart");
                String dramaMovieChoose = input.nextLine().trim().toLowerCase();
                if (dramaMovieChoose.equals("titanic")) {
                    System.out.println("titanic was dded");
                    System.out.println("7.99");
                } else if (dramaMovieChoose.equals("godfather")) {
                    System.out.println("godfather was added");
                    System.out.println("9.99");
                } else if (dramaMovieChoose.equals("braveheart")) {
                    System.out.println("braveHeart was added");
                    System.out.println("6.99");
                } else {
                    System.out.println("We can't find your movie. Please select another one");
                }
            }
        }
        else {System.out.println("We can't find your genres. Please select another one");
        }
    }
}



