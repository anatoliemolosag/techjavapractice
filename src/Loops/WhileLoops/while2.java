package Loops;

public class while2 {
    public static void main(String[] args) {
        //print today is sunday for 10 times

        int sunday =0;

        while( sunday <= 9){
            System.out.println(sunday + " today is sunday");
            sunday++;
        }

        //print numbers from 10 to 0
         sunday=10;
        while (sunday >=0){

            System.out.println("number" + sunday);
            sunday--;

        }

//        //print numbers from 0 to 20 skippingh by 2
//
//        int i = 0;
//
//        while (i < 21){
//            System.out.println(i);
//            i++;i++;///or you can use i +=2;
//        }
//        int j = 1;
//        while (j<21){
//            System.out.print(j + " ");
//            j++;
//            j++;
//
//        }


        //infinite loop
//        int t = 7;
//        while ( t == 7){
//            System.out.println("hello");
//
//        }



    }
}
