package HOMEWORK.Homework6;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneNumberCheck {


    public boolean isValidPhone(String phoneNum){

        String arr[] = phoneNum.split("-");
        if(arr.length!=3){
            return false;
        }
        String firstSection = arr[0];
        String secondSection = arr[1];
        String thirdSection = arr[2];
        if(firstSection.length()!=3||secondSection.length()!=3||thirdSection.length()!=4){
            return false;
        }
        if(firstSection.charAt(0)>'9'||firstSection.charAt(0)<'7')
        {
            return false;
        }
        for(int i =0 ; i< arr.length; i++){

            for(int j =0; j<arr[i].length();j++){

                if(!Character.isDigit(arr[i].charAt(j))){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String a = input.nextLine();
        PhoneNumberCheck obj = new PhoneNumberCheck();
        System.out.println(obj.isValidPhone(a));

    }


}


/*
Write a public method named isValidPhone in Main.java that takes a string parameter
as a phone number that is separated by hyphens.
Check if the phone number is valid or not.
 If it is a valid phone number, return true.
 If it is not a valid phone number,  return false.
Note : The return type of a method will be boolean.

Mobile Number validation criterias:
The number shouldn't have a space or spaces.
The hyphens place is shown on the following line.
***-***-**** (3 digits-3 digits-4 digits)
The first digit should be between 7 and 9(Including 7 and 9).
The rest 9 digits can be any number between 0 and 9.(Including 0 and 9).

Example:
773-773-2374 -> return true   -> because the format of the number is correct.
224-224-2224 -> return false  -> because first character is not between 7 to 9
773-7777-711 -> return false  -> because one of hyphens are not in the right place


 */
