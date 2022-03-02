package IFStatement;

import java.util.Scanner;

public class elseStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have driver licence?true false");
        boolean driversLicence = input.nextBoolean();

        if(driversLicence){

            System.out.println("You can drive in IL");
        }

        else {
            System.out.println("Please take the bus");
        }

        //
        String answer = input.next();
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("You can drive in IL?Yes / No");
        }
        else{
            System.out.println("Please visit secretary of state");
        }

    }
}
