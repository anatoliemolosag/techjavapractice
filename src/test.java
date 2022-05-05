public class test {

    public static void main(String[] args) {


        int [] numbers = {200,340,150,200};

        int largest = 0;
        int secondLargest = 0;

       for (int i = 0 ; i<numbers.length;i++){

               if(numbers[i]>largest){
                   secondLargest=largest;
                   largest=numbers[i];
               }
               else if (numbers[i]>secondLargest&&numbers[i]!=largest){
                   largest=numbers[i];

           }

       }

        System.out.println(largest);
        System.out.println(secondLargest);



    }



}
