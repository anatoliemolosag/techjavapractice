package WrapperClasses.WrapHome;

public class classTest {

    int number;

    public classTest(int number) {
        this.number = number;
    }

    public int sum(int a){

        int b =56;
      int sum =a+b;
        //System.out.println(sum);
        return a+b;


    }

    @Override
    public String toString() {
        return " " + number;
    }


}
