package Arrays.tasks;

public class CountEven {
    public static void main(String[] args) {

        int[] nums ={ 3,4,5,6,7,2,9,76,54,33};

//        int count=0;
//
//        int i = 0;
//        while(i<nums.length){
//
//
//            if(nums[i]%2==0){
//                count++;
//            }
//            i++;
//
//        }
//        System.out.println(count);//counting even numbers //in our case is 5



        int count=0;
        for(int i = 0 ; i<nums.length ; i++ ){
            if(nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);//counting even numbers //in our case is 5

    }
    }

