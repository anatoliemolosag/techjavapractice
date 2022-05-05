import java.util.Arrays;

public class addNumbersArray {

    public static void main(String[] args) {

        int[] numbers = { 100,300,200,450,350 };
        int add = 0;
        for (int i=0;i<numbers.length;i++){

            add+=numbers[i];

        }
        System.out.println(add);

    }
}
