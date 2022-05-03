package AhmedMentoring.DebuggingAndReplaceJava;

public class UnaryAndCompound {
    /*
    Possible interview questions
    Loops questions require the unary operators(i++ , i--)

    ++i ==> preincrement it means it will immeadeatly increase the number of the value
    I++ ==> postincrement it means it will increase the value in the next line

     COMPOUND OPERATORS
     is a way to make your arithmetics works shorter
     EXP : x=x+y  ---> x+=y
           x=x*y  ---> x*=y


     */

    public static void main(String[] args) {

        int number =6 ;
        int secondNumber =number++;//6
        int thirdNumber = ++number;//8
        System.out.println(number++ + thirdNumber);
        System.out.println(secondNumber);
    }





}
