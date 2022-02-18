package primitives;

public class Farm {

    public static void main(String[] args) {

        /*
        1- calculate number of legs in the farm if:
        there are 23 cows and 13 chickens at this farm
        show total number of legs as final result
         */

        int cows = 23;
        int chicken = 13 ;

        int onecowleg = 4;
        int onechickenleg = 2;
        double cow$ = 1200;
        double chicken$ = 15.99;
        double totalamount = cows*cow$ + chicken*chicken$;


        int totallegs = cows*onecowleg + chicken*onechickenleg;
        System.out.println("Total number of legs in this farm is : " + totallegs);

        System.out.println("==================================================");
        System.out.println("total value of the farm $ " + totalamount);

        /* calculate the cost of animals in this farm if:
        each cow costs $1200 and each chicken cost 15$
         */







    }
}
