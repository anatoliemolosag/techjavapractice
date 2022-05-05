import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = { 100,300,200,450,350 };

        for (int i=0;i<numbers.length/2;i++){

            int temp =numbers[i];
            numbers[i]=numbers[numbers.length-i-1];
            numbers[numbers.length-i-1]=temp;


        }
        System.out.println(Arrays.toString(numbers));

    }

}
