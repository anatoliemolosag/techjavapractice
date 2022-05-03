package Arrays.tasks;

public class BiggestNumber {
    public static void main(String[] args) {
        //find the biggest(largest) from the array

        int[] zipCodes = {23,45,12,55,100,690,33,45};
        int biggest = zipCodes[0];
        for (int i =1 ; i<zipCodes.length;i++){
            if(biggest<zipCodes[i]){
                biggest=zipCodes[i];

            }
        }

        System.out.println(biggest);
    }
}
