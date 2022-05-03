package InterviewQuestions;

public class ReverseString {

    public static void main(String[] args) {

        String words = "Hello Techtorial";

        String reverse = "";

        for (int i = words.length() - 1; i >= 0; i--) {
            reverse += words.charAt(i);

        }
        System.out.println(reverse);
        System.out.println("==============================================================");


        String word1 = "Hello Techtorial";

        StringBuffer sb = new StringBuffer(word1);

        System.out.println(sb.reverse());
        System.out.println("=================================================================");

        String word2 = "Hello Techtorial";
        StringBuilder sb1 =new StringBuilder(word2);
        System.out.println(sb1.reverse());
        System.out.println("==================================================================");

        String str = "Anatolie is the best";

        String reversed = "";


        for (int i = str.length(); i >=1 ; i--) {

            reversed+=str.substring(i-1,i);


        }
        System.out.println(reversed);
        System.out.println("=================================================================");
    }
}
