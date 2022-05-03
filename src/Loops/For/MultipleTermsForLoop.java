package Loops.For;

public class MultipleTermsForLoop {
    public static void main(String[] args) {

        for( int i=0 , c=5 ,k=15; i< c && k>c ; i++ , c++ , k--  ){
            System.out.println("i>>" + i);
            System.out.println("c>>" +c);
            System.out.println("k>> " +k);
        }

        char ch ='m';
        int i= 0;

        for (i =10 ,ch = 'a';ch<'h' || i>2 ;ch++,i--){
            System.out.println("Break time is coming in " + i+ "minutes");
        }
        //print out alphabet with lower case with loop
        for (  char c = 'a'  ; c<'z'  ;c++   ){
            System.out.println(c+ " - ");
        }
    }
}
