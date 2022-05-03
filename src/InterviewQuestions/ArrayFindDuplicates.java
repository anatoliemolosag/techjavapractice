package InterviewQuestions;

public class ArrayFindDuplicates {

    public static void main(String[] args) {


        int[] array = {2,2,3,3,4,5,6,6};
        String a ="";
        for ( int i =0 ; i<array.length;i++){

            for (int j = 0 ; j <i ; j++){

                if(array[i]==array[j]){
                    a+=array[i];
                }
            }
        }
        System.out.println(a);

    }
}
