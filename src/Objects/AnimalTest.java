package Objects;

public class AnimalTest {

    //create an Animal object and initialize the energy of the object and run the
    //run the object and recharge the object and show all of information of the
    //object


    public static void main(String[] args) {

        Animal turtle =new Animal();
        turtle.energy= 85;
        int e = turtle.run();
        turtle.sleep();
        turtle.printInfo();
        int ed = turtle.energy;

        if(e==ed){
            System.out.println("bird is happy");
        }else {
            System.out.println("Bird is tired");
        }




    }




}
