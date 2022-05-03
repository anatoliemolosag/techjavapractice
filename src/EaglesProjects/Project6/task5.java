package EaglesProjects.Project6;

public class task5 {
    public static void main(String[] args) {

        int[] numbers = {2,66,3,90,1,-10};

        String combineNumbers= "" ;
        for( int i=0 ; i<numbers.length;i++){
            if(numbers[0]==0){
                continue;
            }
            if(numbers[i]<0){
                numbers[i]*=-1;

            }

            combineNumbers+=numbers[i];
        }

        System.out.println(Long.parseLong(combineNumbers));
        System.out.println(Integer.parseInt(combineNumbers));

        /*
         * Write a method that will accept array of integers as inputs
         * and will print out one long number of combined numbers.
         * If the number is negative accept it as positive
         *
         * For example:
         * {2,66,3,90,1,-10} -> print int 266390110
         * {0,34,5,3,8} -> print int 34538
         *
         * inputs array of numbers
         * output combined numbers of array
         */


    }
}
