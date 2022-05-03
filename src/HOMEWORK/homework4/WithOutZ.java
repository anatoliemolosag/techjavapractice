package HOMEWORK.homework4;

import java.util.Scanner;

public class WithOutZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = s.next();
        if(str.startsWith("Z") || str.startsWith("z")){
            String A = str.replaceFirst("z", "");
            if(str.charAt(1) == 'z' || str.charAt(1) == 'Z'){
                String B = str.substring(2);

            }
            System.out.println(A);

        }
        else if(str.charAt(1) == 'z' || str.charAt(1) == 'Z'){
            String second = str.replaceFirst("z", "");
            System.out.println(second);

        }
        else{
            System.out.println(str);
        }

    }
}
/*
User is asked to enter a string value using scanner.
If one or both of the first 2 chars is 'z', print the
string without those 'z' chars, and otherwise print the string
unchanged.

EXAMPLES:
Input:   "zzTeam"
Output:  "Team"
---------------
Input:   "zTeam"
Output:  "Team"
---------------
Input:  "Hzi"
Output: "Hi"
---------------
Input:  "Testzt"
Output: "Testzt"
 */
