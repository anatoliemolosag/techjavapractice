package StaticPractice;

public class Netflix {

    String accountName="LULU";
    String userName;
    double data = 200;
    static int userCount =1;


    public Netflix(String userName) {
        this.userName = userName;
        userCount++;
    }

    public double streaming (double watchingCartons){
        String message = "Stop watching after 3 hours";
        data -=watchingCartons;
        System.out.println("your remaining data is : "+ data);
        return  data;
    }

    public static void main(String[] args) {
        Netflix flix = new Netflix("kings");
        flix.streaming(5);//195

        Netflix netFlix = new Netflix("efe");
        netFlix.streaming(1);//199




    }
}
