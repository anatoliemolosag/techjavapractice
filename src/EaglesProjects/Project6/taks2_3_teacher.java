package EaglesProjects.Project6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class taks2_3_teacher {
    public static void main(String[] args) {

        String[] words = {"four", "score", "and", "seven", "years", "ago"};
        for( int i = 0 ; i < words.length ; i=i+2){
            String temporary = words[i];
            words[i]= words[i+1];
            words[i+1]=temporary;
        }
        System.out.println(Arrays.toString(words));

        /*
         *
         * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
         * Your method should switch the order of the first two values,
         * then switch the order of the next two, switch the order of the next two, and so on.
         *
         * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
         * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
         *
         * Method that takes String[]
         *
         * prints switched pairs array
         */


    }
}
