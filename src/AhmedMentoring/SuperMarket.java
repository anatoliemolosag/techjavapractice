package AhmedMentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SuperMarket {

    public static void main(String[] args) {

        SuperMarket superMarket = new SuperMarket();
        superMarket.printDairy();
        superMarket.printDairy2();
        superMarket.printAllNameAndPrice();


    }

    //LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein


    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles


    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand


    //TASK 1:
    //  Create three more arrays to store the prices for these products.
    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,

    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,

    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,

    String [] dairy = {"Milk","Cheese","Butter","Yogurt","Cream","Casein"};
    String[] chips = {"Lays","Fritos","Cheetos","Doritos","Ruffles","Pringles"};
    String[] cookies= {"Nabisco","Oreo","Nestle","Amos","SnackWell","MaryLand"};

    double[] dairyPrice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    double[] chipsPrice = {3.99,  2.99,  4.99,  3.49,  1.99,  2.69};
    double[] cookiesPrice = {4.99,  3.99,  5.99,  4.49,  2.99,  3.69};

    ArrayList<String> allDairyNames = new ArrayList<>();
    ArrayList<String> allChipsNames = new ArrayList<>();
    ArrayList<String> allCookiesNames =  new ArrayList<>();
    ArrayList<Integer> allDairyPrice = new ArrayList<>();


    //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )

//first way
    public void printDairy(){

        for ( String dairyProduct :  dairy ){

            allDairyNames.add(dairyProduct);


        }
        System.out.println(allDairyNames);
    }

    //second way


    public void printDairy2(){
        ArrayList<String> alldairyNames2 = new ArrayList<>(Arrays.asList(dairy));
        System.out.println(alldairyNames2);

    }


    //    Create the method to print the Chips.(do it with the list, think about the reason why )

    public void printChips(){

        for ( String chipsProduct :  chips ){

            allDairyNames.add(chipsProduct);

        }
        System.out.println(allChipsNames);

    }



//    Create the method to print the Cookies (do it with the list, think about the reason why )

    public  void printCookies(){
        for (String cookiesProduct : cookies){

            allDairyNames.add(cookiesProduct);


        }
        System.out.println(allCookiesNames);

    }


    //TASK 3:
    //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )

    public void dairyPrice(){



    }


    //    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )




    //    Create the method to print the CookiesPrice (do it with the list, think about the reason why )



    //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )

    Map<String,Double> dairyNameAndPrice = new HashMap<>();

    public void printAllNameAndPrice (){
        for (int i = 0; i < dairy.length; i++) {

            dairyNameAndPrice.put(dairy[i],dairyPrice[i]);
            dairyNameAndPrice.put(chips[i],chipsPrice[i] );
            dairyNameAndPrice.put(cookies[i],cookiesPrice[i] );




        }
        System.out.println(dairyNameAndPrice);
    }




    //    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )




    //    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )




    //TASK 5:
    // Do all Task4 in a same method




    //TASK 6:

    //Create a method with the parameter String nameofItem and find the price of the product ?





    //Create a method with the parameter String value of the product and replace it from the map(old value to new value)

}
