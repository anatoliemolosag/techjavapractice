package Loops;

public class MultiplicationTables {
    /*
    creat a multiplication table from 1 to 5
     */
    public static void main(String[] args) {




    for( int i =1 ; i<=6 ; i++){

        for (int k=1 ; k<=10 ;k++ ){


            System.out.println(i+" * " + k + " = "+ i*k);
        }
        System.out.println("============================");
    }
}}
