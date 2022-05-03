package Loops.BreakAndContinue;

public class BreakAndContinue1 {
    public static void main(String[] args) {


     for (int i =0 ; i<10 ; i++){
        System.out.println("hi");//one time is going to show ,that is because of the break

        for (int j = 0; j<10;j++){
            if(j>2){
                break;
            }

            System.out.println("hello"+j);//one time is going to show,that is because of the break

        }

    }
}}
