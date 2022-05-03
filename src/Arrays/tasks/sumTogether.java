package Arrays.tasks;

public class sumTogether {
    public static void main(String[] args) {

        int[] a = {3,4,5,6};
        int[] b = {4,3,7,8};

        int sum1=0;
        int sum2=0;

        for(int i=0; i<a.length;i++){
            sum1=sum1+a[i];
            System.out.println(sum1);//18

        }
        for (int j =0 ; j<b.length;j++){
            sum2=sum2+b[j];
            System.out.println(sum2);//22
        }

        System.out.println(sum1+sum2);//40
    }

}
