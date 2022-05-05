import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] array = { 65,34,200,500,100};


       for (int i = 0 ;i<array.length;i++){

           for (int k =i;k<array.length;k++){

               if(array[i] > array[k]){
                   int temp =array[i];
                   array[i]=array[k];
                   array[k]=temp;
               }

           }

       }

        System.out.println(Arrays.toString(array));




    }
}
