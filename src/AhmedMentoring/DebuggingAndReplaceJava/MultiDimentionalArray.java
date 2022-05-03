package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Arrays;

public class MultiDimentionalArray {

    /*
    Interview Questions
    *There is no specific interview question for this part , but it is part of difference between array and arrayList

     */

    public static void main(String[] args) {

        String[] month = { "Jan","Feb","Mar","Apr"};
        String[]cost={"23","45","32","18"};
        String[][]allTogether = new String[2][4];//jan 23 Feb 45
        System.out.println(Arrays.toString(month));
        System.out.println(Arrays.deepToString(allTogether));

        for (int i = 0; i < month.length; i++) {
            allTogether[0][i]=month[i];
            allTogether[1][i]=cost[i];
            System.out.println(allTogether[0][i]+ " revenue cost is "+ allTogether[1][i]);

        }




    }

}
