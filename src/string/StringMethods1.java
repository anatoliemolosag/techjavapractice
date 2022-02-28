package string;

public class StringMethods1 {
    public static void main(String[] args) {
        //concat --> joining string together
        // String is immutable
        String name ="Jennifer";

        name += "lopez";
        System.out.println(name);//Jenniferlopez

        name.concat("is not here");

        System.out.println(name.concat("******"));//Jenniferlopez******
        System.out.println(name);//Jenniferlopez

        name = name.concat("!!!!");
        System.out.println(name);//Jenniferlopez!!!!

        //lenght() -->it will count and return number(count) of characters in string

        int count = name.length();
        System.out.println("there are " +count + " << character is string name");
//============================================================================
        String animal = "Monkey";
        System.out.println(animal.length());//6 - calculate animal letters

        //charAt() -- > it will return single character from given string from specific index

        char letter = animal.charAt(1);
        System.out.println(letter);//o

        //find and show last letter of animal
        System.out.println(animal.charAt(5));

        String text= "kjsahdgfodgszfuyhjsagweLSYUfghaiufolgdblfgSdbliufages," + "kjhsdgflsaugzlfiasugdouf";

        System.out.println(text.charAt(text.length()-1));//show last letter of phrase, inn our case is "F"


        System.out.println(animal.charAt(5));//y- last letter of "monkey"
        animal = "bamboo" ;
        int indexofO = animal.indexOf('o');
        System.out.println(indexofO);

        int indexOfX = animal.indexOf('X');
        System.out.println(indexOfX);//-1 , since there is no 'x' in the string (Bamboo)

        System.out.println(animal.indexOf("bo"));//3 (this is the index number from "bamboo"

        System.out.println(animal.indexOf("ooo"));//-1


        // indexof()
        animal = "bamboo";
        System.out.println(animal.indexOf('b'));//0

        int indexOfSecond_b = animal.indexOf('b' , 1);
        System.out.println(indexOfSecond_b);//3

        int indexOfthree_b = animal.indexOf('b' , 4);
        System.out.println(indexOfSecond_b);//3

        int indexOfFourth=  animal.indexOf('b' , animal.indexOf('b')+1);
        System.out.println(indexOfFourth);









    }
}
