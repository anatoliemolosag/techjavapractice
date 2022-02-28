package string;

public class StringBasic {
    public static void main(String[] args) {

        String text = "Techtorial";

        System.out.println(text);

        System.out.println(text + 11);//Techtorial11

        System.out.println( text + 11 + 8);//Techtorial118

        System.out.println(2+3 + text);//5Techtorial

        System.out.println(text + (11 + 8));// Techtorial19

        System.out.println(3-2+text);//1Techtorial

        System.out.println(text+3+2);//Techtorial32

        System.out.println(text +(3-2));//Techtorial1

        System.out.println(text+3*2);//Techtorial6

        System.out.println(text + " Academy");//Techtorial Academy


        String word = new String( " Academy");
        System.out.println(word);//Academy
        System.out.println(text+word);//TechtorialAcademy

        text = text + "******";
        System.out.println(text);//Techtoril******
        System.out.println(word); //Academy
        System.out.println(word + true);//Academytrue

        String dayNumber = "2"+3;
        dayNumber += "is tomorrow";
        System.out.println(dayNumber);//23is tomorrow
        dayNumber += 4;
        System.out.println(dayNumber);//23is tomorrow4

        String somenthing ="";
        System.out.println(somenthing);//
        System.out.println("=============");//================



        /*charAt()
         concat();
         lenght();
         indexOf();
         isEmpty()
         */








    }
}
