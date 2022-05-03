package StringBuilder;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Task1 {

    /*
   create a methode that will take a string as a parameter
   this method will remove '-' (dashes from the given string
   -delete/deleteCharAt coming from String Builder
   show print the final version of the string without dashes

   String str = "In-t-e-r-view-";

    */
    public static StringBuilder deleteDash(String str){



        StringBuilder builder = new StringBuilder(str);


        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i)=='-') {
                builder.deleteCharAt(i);
                i--;
            }

        }
        System.out.println(builder);
        //return new StringBuilder("");
        return builder;



    }
    /*
    Create a method that will take a String Builder as a parameter
    This method will find the sum of digits from the buider object
    Ex: "ASEF$T_4_li_9_^gv_1 "  sum --> 4+9+1=14

     */
    public static int sumOfDigits(StringBuilder builder){
        int sum =0;
        for (int i = 0; i<builder.length();i++ ){

            if(Character.isDigit(builder.charAt(i))){

                sum+= Integer.parseInt(""+builder.charAt(i));
                sum+=Integer.parseInt(String.valueOf(builder.charAt(i)));
                //sum+=builder.charAt(i);
            }

        }
        System.out.println(sum);
        return sum;
    }

    /*
    create a method that will take a String builder array , this method will replace middle char of each
     builder object if the builder object has add amount of letters
     {"JAVA","TESTING", "money", "david", "ana"} -->TES$ING ,mo$ey , da$id , a$na
     */
    public static void replaceMiddle(StringBuilder[] builderArray){

        for (int i = 0; i <builderArray.length; i++) {

           if (builderArray[i].length()%2!=0){
               builderArray[i].replace(builderArray[i].length()/2,((builderArray[i].length()/2)+1),"$");
           }
            System.out.println(builderArray[i]);
        }
        System.out.println(Arrays.toString(builderArray));


    }


    public static void main(String[] args) {

        String str = "--In---t-e-r-view-";
        deleteDash(str);

        StringBuilder bldr = new StringBuilder("ASEF$T_4_li_9_^gv_1");
        sumOfDigits(bldr);

        StringBuilder[] array = { new StringBuilder("java"),new StringBuilder("TESTING"),new StringBuilder("money"),new StringBuilder("ana")};

        replaceMiddle(array);

    }
}
