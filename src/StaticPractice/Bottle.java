package StaticPractice;

public class Bottle {

    String color;
    double size;
    boolean isEmpty;
    double liquidAmount;

    public Bottle(String color, double size, boolean isEmpty , double liquidAmount) {
        this.color = color;
        this.size = size;
        this.isEmpty = isEmpty;
        this.liquidAmount=liquidAmount;
    }

    public void drink(double drinkAmount){
        liquidAmount-=drinkAmount;
        System.out.println("Liquid amount in bottle is now  " + liquidAmount);
        if(liquidAmount==0){
            isEmpty=true;
        }

    }

    public Bottle(String color) {
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("One object is garabdge colected");
        //super.finalize();
    }

    @Override
    public String toString() {
        //System.out.println("This is overriding toString Methode");
        return "This is overriding toString Methode";
    }



    public static void main(String[] args) {
        Bottle b1 = new Bottle("red", 8 , false, 8);
        Bottle b2 = new Bottle("red", 8 , false, 8);
        Bottle b3 = new Bottle("red", 8 , false, 8);
        Bottle b4 = new Bottle("red", 8 , false, 8);
        Bottle b5 = new Bottle("red", 8 , false, 8);


        System.out.println(b1==b2);//false
        System.out.println(b1.equals(b2));//false

        Bottle b6 =new Bottle("white");//false
        Bottle b7 = new Bottle("white");//false

        System.out.println(b6 == b7);
        System.out.println(b6.equals(b7));

        b1 = null;
        b3 =b1;
        b6=null;
        b7=null;

        System.out.println(b5);
        System.out.println(b4);
        System.gc();

        //System.out.println(b1.color);

    }
}
