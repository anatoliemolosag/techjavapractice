package primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        // ther is an event for kids
        //requirement child has to be 6 years or more

        int ageChild = 4;
        int requireAge = 6;

        boolean canAttend = ageChild ==requireAge;
        System.out.println(canAttend);//false

        //eve if the child is 6 or more

        boolean canAttend2 = ageChild >= requireAge;
        System.out.println(canAttend);//false

        // event for kids if their age is less than 6

        boolean canAttend3 = ageChild < requireAge;
        System.out.println(canAttend3);//true

        //event for kids , only 6 year old cannot attend

        boolean canAttend$4= ageChild != requireAge;
        System.out.println(canAttend$4);//true


        int myDistance =20;

        int limit = 10;

        boolean fee = myDistance >= limit ;

        System.out.println(fee);







    }
}
