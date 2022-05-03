package Objects;

public class Animal {

    //those are object variables
    String color ="White";
    int numberOfLegs;
    int age;
    String name;
    int energy;

    public int run(){

        energy -=10;
        System.out.println(name+" is running.Energi is "+energy);


        return energy;
    }

    public void sleep(){

        energy=100;
        System.out.println(name+" is sleeping");
    }
    public int sum() {
    //local variables
        int x = 5;
        int y = 3;
        int total = x + y;
        System.out.println(total);
        return total;

    }

    public void printInfo(){
        System.out.println("Info of my dog");
        System.out.println(color);
        System.out.println(name);
        System.out.println(numberOfLegs);
        System.out.println(age);
        System.out.println(energy);

    }





    }
