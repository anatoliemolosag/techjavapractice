package Loops.For;

public class MultipleTermsForLoop {
    public static void main(String[] args) {

        for( int i=0 , c=5 ,k=15; i< c && k>c ; i++ , c++ , k--  ){
            System.out.println("i>>" + i);
            System.out.println("c>>" +c);
            System.out.println("k>> " +k);
        }
    }


}
