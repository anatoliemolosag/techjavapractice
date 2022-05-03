package InterviewQuestions;

public class FindUpperLowerCasesFromString {

    public static void main(String[] args) {

        String str = "I not Very Good Today";
        String upper = "";
        String lower = "";
        String others = "";

        for (int i= 0 ; i<str.length();i++){

            if(str.charAt(i) >= 65 && str.charAt(i) <=90 ){

                upper+=str.charAt(i);


            }
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                lower+=str.charAt(i);
            }

        }
        System.out.println(upper);
        System.out.println(lower);

    }
}
