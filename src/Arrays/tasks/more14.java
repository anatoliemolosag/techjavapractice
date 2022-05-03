package Arrays.tasks;

public class more14 {
    public static void main(String[] args) {
        int[] nums= {1,4,1,4,1,189,4,456,4,1,1,6,7,8,6};

        int ones = 0;
        int fours=0;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i] ==1){
                ones++;
            }
            if(nums[i]==4){
                fours++;
            }
        }if(ones>fours){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
/*

Given an array of ints, return true if the number of 1's is greater than the number of 4's
Example
more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
