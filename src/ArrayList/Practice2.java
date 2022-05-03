package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Create an Arraylist to store fruit names
        print elements from this ArrayList by using for loop
         */
        ArrayList<String> fruits = new ArrayList<String>();


        fruits.add("orange");
        fruits.add("Apple");
        fruits.add("grape");
        fruits.add("banana");
        for(String element : fruits){
            System.out.println(element);
        }
        System.out.println("======================================================");

        for (int i = fruits.size()-1; i>=0; i--){

            System.out.println(fruits.get(i));
        }

/*Create a methode name it as print "Fruit"
        this method will take arrayList as parameter it will print only the elements/fruits which have 5 or
        more letters


 */



    }

public  void printFruits(ArrayList<String>fruits){



        for(String fruit : fruits){
            if(fruit.length()>=5){
                System.out.println(fruit);
            }
        }

        for(int i = 0 ; i<fruits.size();i++){



        }

}

}
