package HomeTry;

import java.util.Scanner;

public class ArrayTry1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];

        for(int i=0;i< names.length;i++){
            System.out.println("input: ");
            String input1 = input.nextLine();
            names[i]=input1;
        }

        for (String n:names){
            System.out.println(n);
            if(n.equals("anatolie")){

            }
        }


    }
}
