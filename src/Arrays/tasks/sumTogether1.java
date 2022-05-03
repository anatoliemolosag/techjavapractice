package Arrays.tasks;

import java.util.Arrays;

public class sumTogether1 {
    public static void main(String[] args) {

        int[] a = {3,4,5,6};
        int[] b = {4,3,7,8};

        int[] sum = new int[a.length];

        for(int i= 0; i<a.length;i++){
            sum[i]= a[i] +b[i];

        }
        System.out.println(Arrays.toString(sum));

    }
}
//given 2 arrays with equal length, produce a new array whose elements are the sum of the corresponding elements from
// two given numbers
//Ex : sumTogether[8,2,1][3,5,5,]=[11,7,6]
