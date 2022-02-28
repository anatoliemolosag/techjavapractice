package string;

import java.util.Locale;

public class StringMethod2 {

    public static void main(String[] args) {
        String quote = "Do whatever it takes" ;

        //toUpperCase , toLowerCase;

        quote= quote.toLowerCase();
        System.out.println(quote);//do whatever it takes
        quote.toUpperCase();
        System.out.println(quote.toUpperCase());//DO WHATEVER IT TAKES
        System.out.println(quote);//do whatever it takes

        quote=quote.concat(" for your Success");
        quote = quote.toUpperCase();
        System.out.println(quote);//DO WHATEVER IT TAKES

        //startWith , endWith ("do")

        boolean starts =  quote.startsWith("DO"); //DO WHATEVER IT TAKES FOR YOUR SUCCES


        System.out.println(starts);//true
        System.out.println(quote.startsWith("IT"));//false

        boolean ends =quote.endsWith("CESS");
        System.out.println(ends);//true
        System.out.println(quote.endsWith("S"));//true

        boolean contains = quote.contains("4");
        System.out.println(contains);//false

        System.out.println(quote.contains("DO WHATEVER IT TAKES FOR YOUR SUCCES"));//TRUE
        System.out.println(quote.contains("DOWHATEVERITTAKESFORYOURSUCCES"));//false


        String str ="car";

        System.out.println(str.startsWith("v"));//false
        System.out.println(str.startsWith("C"));//false
        System.out.println(str.startsWith("C"));//false
        System.out.println(str.startsWith("car"));//true


        System.out.println(str.contains("car"));//true









}}
