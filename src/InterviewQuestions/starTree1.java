package InterviewQuestions;

public class starTree1 {
    public static void main(String[] args) {

        int height =5;
        for (int i = 1; i < height; i++) {
            //print indentation(space)

            for(int space =1 ; space<=height-i;space++){
                System.out.print(" ");
            }


            //print stars
            for (int star = 1; star <=i*2 -1; star++) {
                System.out.print("*");
            }



            //print new line
            System.out.println();

        }
    }
}