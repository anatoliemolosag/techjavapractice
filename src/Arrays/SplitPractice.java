package Arrays;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String str ="java is easy";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        String[] parts = str.split("a");
        System.out.println(Arrays.toString(parts));

        String date = "03-13-2022";
        String[] part2 = date.split("-");//[j, v,  is e, sy]

        System.out.println(Arrays.toString(part2));//[03, 13, 2022]

        String date1="01.25.2023";

        String[] part3 = date1.split("\\.");
        System.out.println(Arrays.toString(part3));

        String date2 = "01/25/2025";
        String[] part4 = date2.split("/");
        System.out.println(Arrays.toString(part4));



        //verify if the day from given string is 14 march
        String date5 = "3.14.2023";

        String[] data = date5.split("\\.");
        if(data[0].equals("3")&&data[1].equals("14")){
            System.out.println("it is correct day");
        }else{
            System.out.println("it is not corect day");
        }
    }
}
