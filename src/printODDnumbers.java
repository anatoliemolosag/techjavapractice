public class printODDnumbers {

    public static void main(String[] args) {

        int[] array = {3,5,6,7,4,6,8};
        String odd ="";
        String even ="";

        for (int i = 0; i<array.length;i++){

            if(array[i]%2==0){
                even+=array[i];
            }
            else {
                odd+=array[i];
            }

        }
        System.out.println(odd);
        System.out.println(even);
    }
}
