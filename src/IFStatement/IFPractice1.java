package IFStatement;

public class IFPractice1 {

    public static void main(String[] args) {

        System.out.println("I'm learning if statements today");

        int num1 = 5;
        int num2 = 5;

        if (num1 != num2) {
            System.out.println("I'm happy");


        }
        System.out.println("This is after if block");
        //apple number to orange number , if they are the same amount , we will find total payment


        int apple = 20, orange = 20;
        double apple$ = .5, orange$ = .2;

        if (apple == orange) {

            double totalprice = apple * apple$ + orange * orange$;
            System.out.println("This is the total paymet " + totalprice);


        }
    }
}
