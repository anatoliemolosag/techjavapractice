package ArrayList;

import java.util.ArrayList;

public class Phone {

    String brand;
    double price;

    public Phone(String brand, double price){

        this.brand =brand;
        this.price = price;

    }

    @Override
    public String toString(){
        return " brand: " + brand + " price: "+price;
    }

    public static void main(String[] args) {

        Phone phone = new Phone("Xl",999);
        System.out.println(phone);

        Phone samsung = new Phone("loh",876);
        System.out.println(samsung);


        //Create  an ArrayList to store phone object in it
    }
}
