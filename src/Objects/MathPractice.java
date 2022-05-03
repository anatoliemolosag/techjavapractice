package Objects;

public class MathPractice {
    //create a method that will add 2 integer number and show the result
    //create an object to call the method here in the same class

    public void sumCalculator(int a , int b){


        int sum=a+b;
        System.out.println("the total of  "+a+" + "+b+" = " + sum);
    }

    public void sumCalculator(int a , int b, int c){


        int sum=a+b+c;
        System.out.println("the total of  "+a+" + "+b+" + "+c+" = " + sum);
    }

    public static void main(String[] args) {
        MathPractice obj = new MathPractice();
        obj.sumCalculator(4,5);
        obj.sumCalculator(10,25,10);

        Animal turtle = new Animal();
        turtle.sum();
        System.out.println(turtle.sum());

        MathPractice math = new MathPractice();
        double r1 = math.square(3);
        System.out.println(r1);
    }
    public double square(int number ){

        double result = number*number;
        return result * 0;


    }

    //create a method that will take an integer parameter ,
    // it will find the square of that number
    //returns the square / result after multiplying by 0


}
