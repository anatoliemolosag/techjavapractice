public class test1 {

    public static void main(String[] args) {

       String firstName ="Anatolie";
       String lastName = "Molosag";

       firstName=firstName+lastName;

       lastName=firstName.substring(0,firstName.length()-lastName.length());
       firstName = firstName.substring(lastName.length());


        System.out.println("lastname " +lastName);
        System.out.println("firstname " +firstName);

        String reversed ="";
        for (int i = firstName.length(); i >=1 ; i--) {

            reversed += firstName.substring(i-1,i);

        }
        System.out.println(reversed);




    }
}
