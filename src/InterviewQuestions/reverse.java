package InterviewQuestions;

public class reverse {

    public static void main(String[] args) {

        String str = " I love java";
        String newStr ="";

        for (int i=str.length()-1;i>=0;i--){

            newStr+=str.charAt(i);

        }
        System.out.println(newStr);
    }

}
