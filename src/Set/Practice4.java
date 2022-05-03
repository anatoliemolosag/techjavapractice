package Set;

import java.util.*;

public class Practice4 {

    public static void main(String[] args) {

        //store elements from given array to Set by elimination duplicates

        //first solution
        String[] array = {"a","b","b", "c","t","a"};

        ArrayList arrayList = new ArrayList(Arrays.asList(array));
        System.out.println(arrayList);//[a, b, b, c, t, a]

        Set set =new HashSet(arrayList);
        System.out.println(set);//[a, b, c, t]

        //second way solution

        HashSet<String> secondSolution = new HashSet<>();

        for(String letter : array){
            secondSolution.add(letter);

        }
        System.out.println(secondSolution);//[a, b, c, t]

        //third way solution
        HashSet<String> hashSet =new HashSet<String>(Arrays.asList(array));
        System.out.println("======================================");
        //task
        //show duplicates elements from above array2
        //This element is repeating more than once in the array

        String[] array2 = {"a","b","b", "c","t","a"};
        ArrayList<String> list = new ArrayList<>();//list.add(element); this adds from array2 to list (loops)

        HashSet<String> set1 =new HashSet<>();

        for (String element : array2){
           if( !set1.add(element)){
               //System.out.println(set1.add(element));
               list.add(element);
               System.out.println("This element is repeating more than once in the array >>" +element);
           }

        }
        System.out.println("this is the list of repeating elements "+ list);





    }
}
