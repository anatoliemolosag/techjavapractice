package OOP.Inheritance1;

public class Rose extends Flower{

    String color ;

    public Rose(){

        super(3,"Yellow", 1.99,10);
        System.out.println("Rose constructor with No Argument");

    }
    public Rose(double price){
        super(1,"Red",2.01,3);
        this.price=price;
    }
    public Rose(String color){
        super(2,"blue", 3.0,9);
        this.color=color;
    }

    public static void main(String[] args) {
        Flower flower = new Flower(4,"White", .99, 20);
        System.out.println(flower.color);

        Rose rose = new Rose();
        System.out.println(rose.color);

        System.out.println("Rose color >> "+rose.color );

        Rose rose1 = new Rose(5.99);
        System.out.println(rose1.color);

        Rose rose2 = new Rose();
        System.out.println("Rose2 color "+rose2.color);

        rose2.color = "Pink";
        System.out.println("Rose2 color "+ rose2.color);

        rose2.color = "Purple";
        System.out.println("Rose2 color "+ rose2.color);

        System.out.println(rose);
        System.out.println(flower.price);




    }



}
