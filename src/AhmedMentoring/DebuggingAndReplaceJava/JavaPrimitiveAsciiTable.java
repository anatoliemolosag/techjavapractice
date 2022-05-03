package AhmedMentoring.DebuggingAndReplaceJava;

public class JavaPrimitiveAsciiTable {
    public static void main(String[] args) {
        /*
        POSSIBLE INTERVIEW QUESTIONS:
        -1) WHAT IS JAVA AND WHAT IS JDK ,JVM, JRE?(Indian style)
        -2)What do you know about JDK,JVM,JRE?(American Style)
             Tips: Before interview check name of the interviewer to make your ready for the style of questions.
             //3 idiots (machine scene) --> please watch it


        1.Java is a programmer language.
        2.a)JDK(Java Development kit ) -is a software development kit require to DEVELOP aplication in
        java with SPECIFIC LIBRARIES.
          b) JRE (JAVA RUNTIME ENVIRONMENT) is a set of software tools responsible for execution.
          c)JVM -Byte code to Binary code(0,1)



          PRIMITIVES
          8 types

          *WHOLE NUMBERS*
          -int
         -byte
         -short
         -long
         *DECIMALS*
         -Float
         -Double
         *CONDITION*
         boolean - TRUE OR FALSE
         *Char ''
           -ASCII TABLE - is a way to access characters
           -is a table that contains all of the characters (Numbers , lettesrs , symbolys .. etc


           short a = 5;
           short b = 6;
           short c = a+b-2;
           sout (C)-->?


         */
        short a = 5;
        short b = 6;
        short c = (short)(a+b-2);
        c= (short)(a-2);
        int c1=a+b-2;
        System.out.println(c);
        System.out.println(c1);

        char letters = 65;
        char letter2= 'g';

        System.out.println(letter2-letters);//38
        System.out.println(letter2);//g
        System.out.println(letters);//A  (is from ASCII TABLE)


    }
}
