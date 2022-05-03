package AhmedMentoring.DebuggingAndReplaceJava;

import Arrays.BinarySearchPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    /*
    Possible Interview

    1)Can you tell me map and why do you use map in your project?
     *Map is an awesome interface that i use in my project to store my data as Key - Value pairs.

     2) What is the connection between Map and Collection ?
       * they are all useful for the project for different purposes
       As i mentioned before set is all about uniques, list is all about duplication and efficiency.Map is all about key-value

       Show off Notes : MAps is a combination of collections -->
         As you know Key part the map is unique which refers to Set
         Value part of the map can be duplicate which refers to List

     3)What is the type of map and difference between them?
     *HashMap --> put() random order
     *LinkedHashMap --> insertion order
     *Treemap       --> ascending order (keys)

     4)What is synchronization and what do you know about synchronization for Hashtable and StringBuffer?
     Synchronization: it executes any actions one by one.
       -->We have two most common synchronization concept --> HashTable and StringBuffer
      *Synchronized system is ***Thread-Safe*** and **Slow**
      *Non Synchronized system is **Not Thread-Safe** and **Faster** Map is a good example







     */

    public static void main(String[] args) {

        String [] fruits = {"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
        //Task:
        //i want to get the output of total items : Apple = 3;Banana =2,Orange=2;
        //tips : you can use a methode of containsKeys
        //Step1 : I think you are asking me to find the numbers of each fruits right? amd want me show them like
        // this output that you share right?

        //I am going to use loops to access each fruit
        //then i am going to put if conditions for a specific data element
        //and then i'm going to print them out

        Map<String,Integer> fruitCounts  = new HashMap();

        for (int i = 0; i < fruits.length; i++) {

            if(!fruitCounts.containsKey(fruits[i])){ //
                fruitCounts.put(fruits[i],1 );
            }else {
                fruitCounts.put(fruits[i],fruitCounts.get(fruits[i])+1);
            }

        }
        System.out.println(fruitCounts);


        int[] numbers = { 4,5,6,3,8,98,12,23 };

        System.out.println(Arrays.binarySearch(numbers,8));//4



    }


}
