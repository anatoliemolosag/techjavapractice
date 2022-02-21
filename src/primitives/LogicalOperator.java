package primitives;

public class LogicalOperator {
    public static void main(String[] args) {
        //passing a course
        // when your average score is 70 or more and you  attendence is 90% or more


        int requireAverageScore = 70;
        int requireAttendence = 90;

        int studentScore = 69;
        int studentAttendence = 100;

        boolean resultOfScore= studentScore >= requireAverageScore;

        boolean resultOfAttendance =studentAttendence >= requireAttendence;

       boolean pass = resultOfAttendance && resultOfScore;

        System.out.println("Can student pass " + pass);

        boolean pass1 = studentScore >= requireAverageScore && studentAttendence >= requireAttendence;

        System.out.println(pass1);
    }
}
