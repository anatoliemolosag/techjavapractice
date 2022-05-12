public class ReversAString {
    public static void main(String[] args) {

       String firstName = "Anatolie";

        String reversed ="";
        for (int i = firstName.length(); i >=1 ; i--) {

            reversed += firstName.substring(i-1,i);

        }
        System.out.println(reversed);


        System.out.println("============================================");

        String words = "I love Java";

        String reversed1 ="";
        for (int i = words.length()-1; i >=0 ; i--) {

            reversed1 += words.charAt(i);

        }
        System.out.println(reversed1);

        StringBuffer sb =new StringBuffer("Hello");
        System.out.println(sb.reverse());




    }
}
