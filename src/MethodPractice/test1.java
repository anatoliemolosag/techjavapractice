package MethodPractice;


public class test1 {
    public static void main(String[] args) {

        task1 obj =new task1();

        //we can do this
        int [] n = {1,2,3,5};
        obj.sum(n);
        System.out.println(obj.sum(n));//11
        //or we also can do
        //System.out.println(obj.sum(new int[] {1,2,3,5}));
        double[] ids = {8.5,9.6,5.4};
        double result1 = obj.sum(ids);
        System.out.println(result1);

    }

}
