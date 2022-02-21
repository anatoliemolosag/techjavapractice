package primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {
        /*====Task=====
you are ataking three exams for your math class , to be able to pass the Math class:
your average score has to be 60 and class average has to be less than your average .

         */
        int exam1 = 40;
        int examn2= 50;
        int exam3 =85;

        int RequireScore = 60;
        int classaverag = 55;

        boolean result = (exam1+examn2+exam3)/3>=RequireScore && classaverag < (exam1+examn2+exam3)/3;
        System.out.println("can i pass math class " + result);





    }
}
