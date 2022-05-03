package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        ask user to enter how many colors s/he wants to store in array
        -get that many colors from user
        -store those in to an array

        if the lenght of the color is more than 3 letters store that color in to LongColorsName array
        if the lenght of the color is 3 or less letter store that color in the showColor array
         */

        Scanner input = new Scanner(System.in);

        System.out.println("how many Colors do you want to store?");
        int numberOfcolors= input.nextInt();

        String[] colors = new String[numberOfcolors];
        String[] longColorNames = new String[numberOfcolors];
        String[] shortColorNames = new String[numberOfcolors];

        input.nextLine();
        for (int i=0 ; i<numberOfcolors;i++){
            System.out.println("Please enter a color");
            String color = input.nextLine();
            colors[i] = color;

            if(color.length()>3){
                longColorNames[i]=color;
            }else {
                shortColorNames[i]=color;

            }


        }

        System.out.println(Arrays.toString(colors)+ " colors");
        System.out.println(Arrays.toString(longColorNames)+" this is array for long colors");
        System.out.println(Arrays.toString(shortColorNames)+" this is array for short colors");


    }
}
