package Loops;

public class DoWhile4 {
    public static void main(String[] args) {
        /*
        String String = "Abc45L*7%#ht9"
        count letters - 6
        count numbers - 4
        count other symbols - 3
        from this string
         */

        String str = "Abc45L*7%#ht9";
        int index = 0;
        int letterCount = 0;
        int numberCount = 0;
        int othersCount =0;

        do {
            boolean letter = (str.charAt(index)>='A' && str.charAt(index)<='Z' || str.charAt(index)>='a' && str.charAt(index)<='z');
            boolean number = str.charAt(index)>='0' && str.charAt(index)<='9';
            boolean others = !letter && !number;

            if(letter){
                letterCount++;
            }if(number){
                numberCount++;

            }if (others){
                othersCount++;
            }index++;

        }while(index<str.length());
        System.out.println("There are " + letterCount + " letters in the string" );
        System.out.println("There are " + numberCount + " numbers in the string");
        System.out.println("There are " + othersCount + " others in the string");

    }
}
