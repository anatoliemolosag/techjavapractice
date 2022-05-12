public class swapTwoStrings {

    public static void main(String[] args) {

       String firstName ="Anatolie";
       String lastName = "Molosag";

       firstName=firstName+lastName;

       lastName=firstName.substring(0,firstName.length()-lastName.length());
       firstName = firstName.substring(lastName.length());



        System.out.println("lastname " +lastName);
        System.out.println("firstname " +firstName);

        int a =5;
        int b =15;

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("a = "+a);
        System.out.println("b = "+b);

        }





    }

