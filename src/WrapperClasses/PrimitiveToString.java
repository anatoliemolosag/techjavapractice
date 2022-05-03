package WrapperClasses;

public class PrimitiveToString {

    public static void main(String[] args) {


        int number = 45;

        String stringNumber = ""+number;

        String strNumber = String.valueOf(number);
        System.out.println(stringNumber.concat( " now is a string"));

        String str1Number = Integer.toString(number);

        System.out.println(str1Number.charAt(str1Number.length()-1)<='0' && str1Number.charAt(str1Number.length()-1)<='9');
        System.out.println(str1Number.charAt(str1Number.length()-1)==5);
        System.out.println(str1Number.charAt(str1Number.length()-1)=='5');

        Boolean wr = Boolean.valueOf("235");
        System.out.println(wr);


        Integer number4 = null;
        int number1 = number4;
        System.out.println(number1);

    }
}
