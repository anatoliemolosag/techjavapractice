package Switch;

import java.util.Scanner;

public class WeekdayWeekend {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        byte num = input.nextByte();

        /*
        1 - 5 ---> wekday

        6 - 7 ---> weekend
         */
        final byte number = 8;

        switch (num){
            case 1:
                int x = 5 + 5;
                System.out.println(x);
            case 2:num++;
            case 3:++num;
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("There is no other option");


        }

    }
}
