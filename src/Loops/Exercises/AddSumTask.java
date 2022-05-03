package Loops.Exercises;

public class AddSumTask {
    public static void main(String[] args) {

       int[] arr = {10,3,5,6};
       int larger = arr[0];
       int smaller = arr[0];


       for(int i =0 ; i<arr.length; i++){
           if(larger<arr[i]){
               larger=arr[i];
           }
           if (smaller>arr[i]){
               smaller=arr[i];
               int sum = larger+smaller;
               System.out.println("This is the sum of the smaller and larger number in the Array " + sum);
           }



       }

        System.out.println("This is the larger number from Array "+ larger);
        System.out.println("This is the smaller number from Array "+ smaller);



    }
}
