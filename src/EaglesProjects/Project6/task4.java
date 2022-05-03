package EaglesProjects.Project6;

public class task4 {
    public static void main(String[] args) {

        int[] nums = {3, 2, 4, 5, 1};

        int indexOfNumberOfOne = -1;
        for(int i =0 ; i < nums.length;i++ ){
            if(nums[i]==1){
                indexOfNumberOfOne = i;
                break;
            }

        }
        int indexNumberOfTwo =-1;
        for(int i =0 ; i < nums.length;i++ ){
            if(nums[i]==2){
                indexNumberOfTwo = i;
                break;
            }

        }
        if ((indexOfNumberOfOne>=0&&indexNumberOfTwo>=0)&&(indexOfNumberOfOne<indexNumberOfTwo)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



        /*
         *
         * Write a method that takes an array of integers and print a boolean.
         * print true if the array contains 1 and 2 later somewhere in the array,
         * and 1 has to come before 2.
         *
         * contains12([1, 3, 2]) -> true
         * contains12([3, 1, 2]) -> true
         * contains12([3, 1, 4, 5, 2]) -> true
         * contains12([3, 2, 4, 5, 1]) -> false
         *
         * inputs nums
         * output boolean
         */

    }
}
