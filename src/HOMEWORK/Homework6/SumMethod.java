package HOMEWORK.Homework6;

public class SumMethod {


public int sumOfNumbers(int[]array){

    int sum=0;
    for(int i=0;i< array.length;i++){
        sum+=array[i];

    }
    System.out.println(sum);
    return sum;

}

    public static void main(String[] args) {
    SumMethod obj = new SumMethod();

    int[] array ={ 3,4,5,6,7};
    obj.sumOfNumbers(array);

    }







    /*
    Create a public method named sumOfNumbers INSIDE THE Method.java class.
This method will take array of integers
and return sum of integer numbers in the array.

     */
}
