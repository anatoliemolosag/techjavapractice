package IFStatement;

public class IfPractice2 {
    public static void main(String[] args) {
        int number=5;
        if (number < 4) {
            int missing = 4 - number;
            number += missing;
            System.out.println("Wrong number you had "+missing+" missing");
        } else if (number > 4) {
            int extra = number - 4;
            number -= extra;
            System.out.println("Wrong number you had "+extra+" extra");
        } else if (number == 4){
            System.out.println("Correct number");
        }
    }
}
