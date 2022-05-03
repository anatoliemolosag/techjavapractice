package StringBuilder;

public class AlphabetTask {
    /*
    create a methode that will return lower alphabet as a String and print it ,
     */
    public static String printAlphabet(){

        String alphabet ="";
        for (char ch = 'a' ; ch <='z';ch++ ){
            alphabet+=ch;

        }
        System.out.println(alphabet);

        return alphabet;

    }


    public static void main(String[] args) {

        printAlphabet();
    }
}
