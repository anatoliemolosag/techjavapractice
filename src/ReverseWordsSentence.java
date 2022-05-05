public class ReverseWordsSentence {

    public static void main(String[] args) {


        String sentence = "I love Java";
        String[] array = sentence.split(" ");

        String reversed = "";

        for (int i = array.length-1; i>=0;i-- ){

            reversed+=array[i] + " " ;
        }
        System.out.println(reversed);

    }
}
