package Loops.BreakAndContinue;

public class BreakAndcontinue2 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){

            for(int j = 0 ; j<5 ;j++){

                if(i>1 && i <=7){

                    System.out.println("i>>" + i);
                    continue;


                }

            }

        }
    }
}
