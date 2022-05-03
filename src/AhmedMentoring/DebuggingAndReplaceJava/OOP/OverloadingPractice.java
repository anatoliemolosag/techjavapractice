package AhmedMentoring.DebuggingAndReplaceJava.OOP;

public class OverloadingPractice {

    public void areCalculation(int side1, int side2, int side3){
        System.out.println(side1*side2*side3);
    }
    private String  areCalculation(int side1, int side2, int side3,int side4){
        System.out.println(side1+side2+side3+side4);
        return "";
    }


    public static void main(String[] args) {
        OverloadingPractice overloadingPractice = new OverloadingPractice();
        overloadingPractice.areCalculation(1,2,3,4);
    }


}
