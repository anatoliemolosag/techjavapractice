package AhmedMentoring.Overriding;

public class DigitalClock extends Clock {

    public int numberOfSeconds=42;

    @Override
    public String toString() {
        return  Integer.toString(numberOfSeconds);
    }

    public static void main(String[] args) {
        Clock childClock = new DigitalClock();
        childClock.numberOfSecond=50;

        System.out.println(childClock.numberOfSecond);
        System.out.println(childClock.toString());


    }
}
