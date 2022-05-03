package EaglesProjects.Project5;

import java.util.Scanner;

public class task2MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int min = input.nextInt();

        System.out.println("Please enter a max number");
        int max = input.nextInt();
        int sum = 0;
        for( ; min<=max; min++){
            if((min % 2==0) && (min % 7 == 0)){
                sum = sum +min;

                System.out.println(min);
            }

        }
        System.out.println(sum);
    }
}
