package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please choose from following departments : \n1 - IT  \n2 - HR  \n3 - Admin  \n4 - HelpDesk");

         int department = input.nextInt();
         switch (department){//Sam , David , Timo
             case 1:
                 System.out.println("Who do you want to speak with : \nSam \nDavid \nTima");
                 String name = input.next().toUpperCase();
                 switch (name){
                     case "SAM":
                     case "DAVID":
                     case "TIMA":
                         System.out.println("Hi, you a talking " + name + " from " + department);break;
                     default:
                         System.out.println("There is no such a person in this department " + name);
                         break;
                 }break;
             case 2:
                 System.out.println("who do you want to speak in " + department + " with \nDavid \nAlex" );
                 name = input.next().toUpperCase();
                 switch (name){
                     case "DAVID":
                     case "ALEX":
                         System.out.println("Hi, you a talking " + name + " from " + department);break;
                     default:
                         System.out.println("There is no such a person in this department " + name);
                         break;


                 }break;

         }
    }
}
