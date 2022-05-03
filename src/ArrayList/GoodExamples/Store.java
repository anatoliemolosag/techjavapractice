package ArrayList.GoodExamples;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        Computer c1 = new Computer("apple","macPro", 2200,16);
        Computer c2 = new Computer("Dell","D5", 1800,13);
        Computer c3 = new Computer("HP","Envy", 1300,15);
        Computer c4 = new Computer("apple","macAir", 1100,11);

        Flower f1 = new Flower("Daisy", "purple" ,3);

        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Computer> devices = new ArrayList<>();
        ArrayList<Flower> flowers = new ArrayList<>();

        flowers.add(f1);
        System.out.println("----------------------------------");
        System.out.println(flowers);//[name:Daisy Color: purple price: 3.0]
        System.out.println("----------------------------------");
        System.out.println(flowers);//[name:Daisy Color: purple price: 3.0]
        System.out.println("----------------------------------");


        list.add(c1);
        list.add(f1);
        System.out.println(list);//[Make:appleModel:macPro price: 2200.0 screen size :16.0, name:Daisy Color: purple price: 3.0]
        System.out.println("-----------------------------------------------------------------------------");



        devices.add(c1);
        devices.add(c2);
        devices.add(c3);
        devices.add(c4);
        System.out.println(devices);
        System.out.println("--------------------------------------------------------------------------");


//        double total =0;
//
//        for(Computer computer : devices){
//            total += computer.price;
//
//        }
//        System.out.println(total);

        double totalPrices = 0;
        String make ="";
        String model ="";

        for (int i=0; i<devices.size();i++){
            totalPrices +=devices.get(i).price;
            make+=devices.get(i).make + " ";
            model+=devices.get(i).model+ " ";



        }
        System.out.println(make);
        System.out.println(model);
        System.out.println(totalPrices);



    }
}
