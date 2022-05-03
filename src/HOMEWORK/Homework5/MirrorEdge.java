package HOMEWORK.Homework5;

import java.util.Scanner;

public class MirrorEdge {
    public static void main(String[] args) {

        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();

        String result = "";
        String tmp1 = "";
        String tmp2 = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            tmp1 += str.substring(i,i+1);
            tmp2 = "";
            for (int j = tmp1.length()-1; j >= 0; j--) {
                tmp2 += tmp1.substring(j,j+1);
                if (tmp2.equals(str.substring(len-i-1,len)))
                    result = tmp1;
            }
        }
        System.out.println(result);



    }

}
