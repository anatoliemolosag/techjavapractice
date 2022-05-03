package Arrays;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        int[] ids = {22,33,44,55,1,6,8,100,355};
        //print out numbers less than 30


        for (int i=0 ; i<=ids.length-1 ; i++ ){
            //System.out.println(ids[i]);
            if(ids[i] < 30){
                System.out.println(ids[i]);
            }

        }

        Object[] items = { "text", 22,33,'7', 'A' , true ,false , ids};
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.deepToString(items));


//        for(int i=0 ; i< items.length; i++){
//            for (int k = 0 ; k<items.length;k++){
//                System.out.println(k);
//
//            }
//            System.out.println(i);
//        }

    }
}
