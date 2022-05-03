package MethodPractice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AgeOfPerson {
    /*

    create a methode that will calculate age of person
    -it will not return the age
    -it should take a parameter
    -prints the age

    */

    public void ageCalculator(int bitrhYear){
        int age =2022 - bitrhYear;
        System.out.println("your age is "+ age);
    }

    /*
overload this method and get birth year and name the person
" ... your age is ..."
 */

    public void ageCalculator(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your name");
       String name = scanner.nextLine();
        System.out.println("Please enter your birth year");
        int birthYear = scanner.nextInt();

        System.out.println(name + " your age is " + (2022-birthYear));


    }


    public static void main(String[] args) {

        AgeOfPerson person = new AgeOfPerson();
        person.ageCalculator();
        person.ageCalculator(1990);

    }



}
