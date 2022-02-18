package firstPractice.variables;

public class VariablePractice2 {

    public static void main (String[] args){


        int number; // declaring variable
        //System.out.println(number); compile time error

        number =8; // iniatializing variable (giving a value)

        System.out.println(number);  //  8

        number =2; //reassignment (giving a new value)
        System.out.println(number); // 2

        int money = 100; // declaring and initializing

        int money$ = 12;
        int $money = 13;
        int _money = 11;
        int my_money =10;
        //int money% = 12;(error)
        //int money1 = 11; (error)
        //int 1money = 12 ;
        int mone1y =132;

        int costofComputer = 1000;
        int _costofComputer = 1000;

        System.out.println("$" + ( money$ + $money +_money * my_money));

        System.out.println("cost of computer $" + (costofComputer + _costofComputer ));







    }
}
