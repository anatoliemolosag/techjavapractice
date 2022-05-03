package MethodPractice;

public class VarArgsExample1 {

    public static void main(String[] args) {

        printNames();

        printNames("Chriss", "emma" , "lulu");

    }

    public static void printNames(String ... names){

        for (String name : names){
            System.out.println(name);
        }
    }
}
