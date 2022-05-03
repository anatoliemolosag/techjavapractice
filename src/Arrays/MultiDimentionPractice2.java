package Arrays;

import java.util.Arrays;

public class MultiDimentionPractice2 {
    public static void main(String[] args) {

        String[] ny = {"New York","Brooklyn"};
        String[][] citiesOfStates = {{"Chicago", "Springfield", "Rosemont", "Napperville"},{"Miami ","Tampa"},{"Huston", "Dallas", "Austin"},ny};

        citiesOfStates[1][1]="xxx";

        System.out.println(Arrays.deepToString(citiesOfStates));//[[Chicago, Springfield, Rosemont, Napperville], [Miami , xxx], [Huston, Dallas, Austin], [New York, Brooklyn]]


//        for(int i = 0 ; i< citiesOfStates.length;i++){
//            for (int j = 0;j<citiesOfStates[i].length;j++){
//                System.out.println(citiesOfStates[i][j]);
//
//            }
//        }

      for( String[] cities : citiesOfStates){

          for (String city:cities){

              System.out.println(city);//it will show every single city

          }





      }



        String [][][] array = { {{"a"},{"b"},{"c"} },{ {"c"},{"d"},{"e"} },{{},{},{}}   , {}  , {}  };

        System.out.println(Arrays.deepToString(array));

        array[2][2]= new String[]{"Text"};
        System.out.println(Arrays.deepToString(array));





      }





}
