package IFStatement;

public class CurlyBraces {
    public static void main(String[] args) {

        int number =12;


        if(number==12){

            System.out.println("this is first line");
            System.out.println("this is second line");
        }

        if(number!=12){

            System.out.println("this is first line");
            System.out.println("this is second line");
        }

        if(number==12)

            System.out.println("this is first line -- no curly braces");
            System.out.println("this is second line -- no curly brces");



        if(number==44)

            System.out.println("this is first line -- no curly braces---false");//this lane is not going to print because
        // the conditiuon is false , it affects only the first statement
        System.out.println("this is second line -- no curly brces--false");

    }
}
