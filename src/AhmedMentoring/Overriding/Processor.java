package AhmedMentoring.Overriding;

import java.util.Arrays;
import java.util.Objects;

public class Processor {
    public void process(int i, int j) {
        System.out.printf("Processing two integers:%d, %d", i, j);
    }

    public void process(int[] ints) {
        System.out.println("Adding integer array: " + Arrays.toString(ints));
    }

    public void process(Objects[] obj) {
        System.out.println("Adding integer array: " + Arrays.toString(obj));
    }
}

    class MathProcessor extends Processor{

        @Override
        public void process(int i, int j) {

            System.out.println(" Sum of integers is  " + (i+j));
        }

        @Override
        public void process(int[] ints) {
            int sum = 0;
            for(int i: ints){
                sum+=i;

            }
            System.out.println("Sum of integer array element is " + sum);
        }
    }

    class Demo1 {

        public static void main(String[] args) {
            Processor parentObj = new Processor();
            parentObj.process(new int[]{1, 2, 3, 5});


            int[] a = { 1,2,3,4,5,6};
            Processor childObj = new MathProcessor();
            childObj.process(a);


        }
    }

