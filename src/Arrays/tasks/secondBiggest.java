package Arrays.tasks;

public class secondBiggest {
    public static void main(String[] args) {
        //find the secondLargest(largest) from the array

        int[] zipCodes = {23,45,12,55,100,690,589,33,1};
        int biggest = zipCodes[0];
        int secondBiggest = zipCodes[0];
        int thirdLargest = zipCodes[0];
        int fourthLargest = zipCodes[0];

        int i;
        for ( i =0 ; i<zipCodes.length;i++){
            if(biggest<zipCodes[i]){
                biggest=zipCodes[i];
            }


        }for (i=0 ;i<zipCodes.length;i++){
            if(zipCodes[i] != biggest && zipCodes[i]>secondBiggest){
                secondBiggest=zipCodes[i];
            }

        }
        for (i=0; i<zipCodes.length; i++){
            if(zipCodes[i] != biggest && zipCodes[i]!= secondBiggest && zipCodes[i]>thirdLargest){
                thirdLargest=zipCodes[i];

            }
        }
        for (i=0 ; i<zipCodes.length; i++){
            if(zipCodes[i] !=biggest && zipCodes[i] != secondBiggest && zipCodes[i] != thirdLargest && zipCodes[i]>fourthLargest){
                fourthLargest=zipCodes[i];
            }

        }



        System.out.println("This is the biggest number from array \n" + biggest);
        System.out.println("This is the second biggest number from array \n" +secondBiggest);
        System.out.println("This is the third biggest number from the array \n" + thirdLargest);
        System.out.println("This is the fourth biggest number from Array \n" + fourthLargest);
    }
}

