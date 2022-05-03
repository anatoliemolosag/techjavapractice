package Loops.BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
         LABEL:
        for (int i =0 ; i<10 ; i++){
            System.out.println("hi");//one time is going to show ,that is because of the break

            for (int j = 0; j<10;j++){

                System.out.println("hello"+j);//one time is going to show,that is because of the break
                break LABEL;
            }
            break ;
        }
    }
}
