package InterviewQuestions;

public class ReverseStringWordByWord {
    public static void main(String[] args) {

        String str = "I love Java";

        String reversed ="";

        String[] array = str.split(" ");

        for (int i = array.length-1 ; i>=0;i--){

            reversed+=array[i]+ " ";

        }
        System.out.println(reversed);

    }
}
