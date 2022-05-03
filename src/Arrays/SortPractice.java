package Arrays;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        //sort the Arrays from the smallest to largest or alphabetically

        int[] zipCodes = {-25,23,45,12,55,100,690,33,45,-1234};
        System.out.println(Arrays.toString(zipCodes));

        Arrays.sort(zipCodes);
        System.out.println(Arrays.toString(zipCodes));



        String[] colors = {"Red", "Blue" , "white", "pink", "Violet", "Green" , "Yellow", "BROWN"};
        System.out.println(Arrays.toString(colors));//[Red, Blue, white, pink, Violet, Green, Yellow, BROWN]

        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));//[BROWN, Blue, Green, Red, Violet, Yellow, pink, white] (Uppercase first , lower




        //change every item from colors array to lowercase version and store it in newColors array

        String[] newColors = new String[colors.length];

        for (int i =0; i<colors.length; i++){
            newColors[i]=colors[i].toLowerCase();

        }
        System.out.println(Arrays.toString(newColors));//[brown, blue, green, red, violet, yellow, pink, white]




    }
}
