package string;

public class SubstringMethode {
    public static void main(String[] args) {

        String item ="flowers are beautiful";

        //substring(); it will return string

        String part1 =  item.substring(3);
        System.out.println(part1);//wer


        String part2 = item.substring(1,4);
        System.out.println(part2);//low

        /*task
        take part of string starting from 'w' 't' and print

         */

        String part3 = item.substring(item.indexOf('w') , item.indexOf('t') + 1);
        System.out.println(part3);

        System.out.println(item.substring(3,17 ));//wers are beaut

        /*take part of string starting from 'w' to 'e' (inclusive) which is after 'b' and print it

         */
        String part4 = item.substring(item.indexOf('w') , item.indexOf('b') + 2);
        System.out.println(part4);//wers are be

        System.out.println(item.substring(2,2));//nothing retuns
        //System.out.println(item.substring(5,2));//error

        //System.out.println(item.substring(2, 55));// begin 2, end 55, length 21







    }
}
