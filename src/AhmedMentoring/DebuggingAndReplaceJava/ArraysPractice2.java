package AhmedMentoring.DebuggingAndReplaceJava;

public class ArraysPractice2 {
    public static void main(String[] args) {
        //Print out the smallest and largest numbers from array
        int[] numbers = {100,300,200,450,350};
        //you cannot use sort method.
        //tips think about loops and if condition
        //output : smallest number is 100 and largest numver is 450

       int smallest =numbers[0];
       int largest= numbers[1];
        for(int number : numbers){

            if(number<smallest){
                smallest=number;
            }else if(number>largest){
                largest=number;
            }
        }
        System.out.println("the smallest "+smallest+ " and the largest"+ largest);
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }else if(numbers[i]>largest){
                largest=numbers[i];


            }
        }
        System.out.println("the smallest "+smallest+ " and the largest"+ largest);
    }
    }


