package EaglesProjects.Project6;

import java.util.Arrays;

public class task2_1_swapPairs {
    public static void main(String[] args) {

        String[] txt1 = {"four", "score", "and", "seven", "years", "ago",};

        for (int i = 1; i < txt1.length; i += 2) {
            String temp = txt1[i-1];//move one step back index 1 from array
            txt1[i - 1] = txt1[i];//
            txt1[i] = temp;





    }
        System.out.println(Arrays.toString(txt1));
    }}

             /*
        /**
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