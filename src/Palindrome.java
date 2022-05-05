public class Palindrome {

    public static void main(String[] args) {

        String name = "ana";
        String reversed = "";

        for (int i =name.length()-1; i>=0;i--){

            reversed+=name.charAt(i);


        }

        if (name.equals(reversed)){
            System.out.println(name + " it's a palindrome");
        }else {
            System.out.println(name+ " is not a palindrome");
        }

    }
}
