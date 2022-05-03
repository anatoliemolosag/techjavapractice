package AhmedMentoring.Constructor;

public class Baby2 {

    String name;
    String gender;
    double height;
    double weight;
    String eyeColor ;
    int brainCapacity;

    public Baby2(String name) {
        this.name = name;
    }

    public Baby2(String gender, String eyeColor) {
        this.gender = gender;
        this.eyeColor = eyeColor;
    }

    public Baby2(double height, double weight, String eyeColor) {
        this("Ahmet");
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        System.out.println("you called 3 argument constructor");
    }

    public Baby2(String name, String gender, double height, double weight, String eyeColor, int brainCapacity ) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.brainCapacity = brainCapacity;
    }
}
