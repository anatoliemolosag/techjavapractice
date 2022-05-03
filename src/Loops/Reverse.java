package Loops;

public class Reverse {
    public static void main(String[] args) {


        String str ="Selenium";
        //reverse this string ==> mineles
        //"Reverse version of given string is : "+..."
        String reversed = "";
        for(int i = str.length()-1; i >=0 ; i--){
            reversed=reversed+str.charAt(i);
            System.out.println(reversed);
        }
        //System.out.println(reversed);
    }
}
