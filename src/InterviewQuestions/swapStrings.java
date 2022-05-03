package InterviewQuestions;

public class swapStrings {

    public static void main(String[] args) {

        String a = "Ahmed";
        String b = "Seden";
        a= a.concat(b);//AhmedSeden
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);



    }
}
