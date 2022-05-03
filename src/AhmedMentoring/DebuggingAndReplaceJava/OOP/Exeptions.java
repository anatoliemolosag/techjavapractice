package AhmedMentoring.DebuggingAndReplaceJava.OOP;

public class Exeptions {

    /*
    Interview Questions:

    1-How do you handle the exceptions?
    *We can handle the exception with try and catch block.
    2-Can you use mor than one catch block ?how about try block?
    We can use more than one catch block .but we can use only one try block
    3-What dou you know about final,finally, finalize?
         *Final : is a keyword to make the varables unchangeble
         *Finally : is a block that comes after try catch block to show final execution(statelment)
         *Finalize : is a methode which work with GC to make sure it is manually worked (System.gc)

    4-Throw and Throws?
    Both and throws are the concept of exception handaling in which throws i used explicitly throw and exeption from a method of any block of code.
       -->public void exceptionExample() throws ArithmeticOperators(){}
       **While throws are used in the signature in the methode to indicate that this methode might throw one of the exeptions,
       **Throw is used in the block of code or methode

     */

    public static void main(String[] args) {
        System.out.println("today is is the last day of java ");
//        String numbers = "35c";
//        int sum =0;
//
//        for (int i = 0; i < numbers.length(); i++) {
//            sum+=Integer.parseInt(String.valueOf(numbers.charAt(i)));
//
//
//        }
//        System.out.println(sum);

        try {
            String numbers = "35c";
            int sum =0;

            for (int i = 0; i < numbers.length(); i++) {
                sum+=Integer.parseInt(String.valueOf(numbers.charAt(i)));


            }
            System.out.println(sum);
        }catch (NumberFormatException exception){
            System.out.println("There is a number format exception");
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("there is a indexBound properly");
        }finally {
            System.out.println("I am a finally block");
        }
    }
}
