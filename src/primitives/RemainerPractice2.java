package primitives;

public class RemainerPractice2 {
    public static void main(String[] args) {

        /*
        phone $986
        decided to do monthly payments of 100
        find oud last months payment and show
         */


        int phone =986;
        int mPayment =100;
        int lastPayment = phone %mPayment;

        System.out.println(" You will pay  $" + lastPayment + " on your last bill");

        System.out.println(60 % 525600);




    }
}
