package InterviewQuestions;

public class CountUpperLowerCasesFromString {

    public static void main(String[] args) {


        String str = "I Am Very Good Today";
        int countUpper=0;
        int countLower = 0;



        for (int i =0 ; i<str.length();i++){

            if(str.charAt(i) >='A'&& str.charAt(i)<='Z'){
                 countUpper++;
            }
            else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                countLower++;
            }


        }
        System.out.println(countUpper);
        System.out.println(countLower);


    }
}
