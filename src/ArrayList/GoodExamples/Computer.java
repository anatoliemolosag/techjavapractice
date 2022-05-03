package ArrayList.GoodExamples;

public class Computer {

    String make ;
    String model;
    double price;
    double screenSize;

    public Computer(String make, String model, double price, double screenSize) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Make:" + make + "Model:" + model +" price: "+price + " screen size :" + screenSize;
    }
}
