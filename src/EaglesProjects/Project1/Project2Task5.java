package EaglesProject;

import java.util.Scanner;

public class Project2Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three different ingredients with space ");
        String name = input.nextLine();
        System.out.println("Please enter any number");

        int num = input.nextInt();
//
        String fisrtIngred = name.substring(0, name.indexOf(" "));
        name = name.substring(name.indexOf(" ")).trim();
//        System.out.println(name);

        String secondIngred = name.substring(0, name.indexOf(" "));
        name = name.substring(name.indexOf(" ")).trim();
//        System.out.println(name);

        String thirdIngred = name;

//        System.out.println(fisrtIngred);
//        System.out.println(secondIngred);
//        System.out.println(thirdIngred);

        fisrtIngred = fisrtIngred.replace(fisrtIngred.charAt(0), ' ').trim();
        secondIngred = secondIngred.replace(secondIngred.charAt(0), ' ').trim();
        thirdIngred = thirdIngred.replace(thirdIngred.charAt(0), ' ').trim();

        String output = num + fisrtIngred + " " + (++num) + secondIngred + " " + (++num) + thirdIngred;
        System.out.println(output);
















    /*Using a scanner enter three different ingredients for the product on thesame line. Then ask the user to enter any int number.
     Change the firstletter of the ingredients starting from the entered number.
    (Ingredientsshould start with different letters. Please read the example carefully )
    Example 1:
    Please enter three ingredients with spaces:
    Milk Peanuts Butter
    Please enter the int number:
    5
    The output is:
    5ilk 6eanuts 7utter

     */

    }
}