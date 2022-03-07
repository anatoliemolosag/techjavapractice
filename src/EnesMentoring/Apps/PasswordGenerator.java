package EnesMentoring.Apps;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password created from your name");

        String name = input.nextLine();

        System.out.println("Please enter surname");

        String surname = input.nextLine();

        System.out.println("Please enter your birth year");
        String birthYear = input.nextLine().trim();

        System.out.println("Please enter your country name");
        String coutryName = input.nextLine().trim();

        System.out.println("Please enter special character");
        String specialChar = input.nextLine();

        String first2OfYear = birthYear.substring(0,2);
        //Anatolie
        //01234567

        String last2OfName = name.substring(name.length()-2);

        String last2OfSurname = surname.substring(0,2).toUpperCase();

        String first2OfNameUpper = name.substring(0,2).toUpperCase();

        String firstLetterNameLower = surname.substring(0,2).toLowerCase();

        String firstLetterOfCountry = coutryName.substring(0,1);

        String firstThreeOfBirthYear = birthYear.substring(birthYear.length()-3);

        String password = first2OfYear + last2OfName +last2OfSurname + first2OfNameUpper + firstLetterNameLower + last2OfSurname +
                firstLetterNameLower + last2OfSurname + firstLetterOfCountry + firstThreeOfBirthYear + specialChar ;

        System.out.println("*********************************");
        System.out.println(" ");
        System.out.println("Generated password : " + password);
        System.out.println(" ");
        System.out.println("*********************************");






    }
}
/*// Password Generator APP
//
// Create a password from your name, surname, birth year, birth country and one special character
// Take those three information from user as a input
// Make sure that provided information has three or more digits.

// - supply your first two digit of birth year as a begining of password
// - supply last two letters from your name
// - supply first two letters from surname
// - supply first two letters from name as a uppercase
//  - supply first letter from name as a lowercase // Can I use char?
// - supply last two letters from surname as a uppercase
//  - supply first letter of your country
// - supply your last three digit of birth year
// - supply one of the char given : . * / $
// - Follow the steps respectively

 */