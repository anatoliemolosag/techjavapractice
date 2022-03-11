package IFStatement;

public class CurlyBraces1 {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        if (x > y)//first statement is afected because is false

            ++y;

        ++x;
        y = x + y;
        System.out.println("this is the value of y: " + y);//16

        if (y >= x)

            ++y;
        ++x;
        y = x + y;
        System.out.println("new value of y " + y);

    }
}
