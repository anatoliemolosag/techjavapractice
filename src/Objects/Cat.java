package Objects;

public class Cat {

    String name;
    String color;
    int age;
    int foodAmount;

    /*
    create a run method
    that will take one parameter for destination
    this method will reduce the food amount by 1 lbs every time you call it
    print  --> "<name> is running to <destination>
    print food amount
     */

public void run(String destination){

    foodAmount-=1;
    System.out.println(name+ " is running "+ destination);
   System.out.println(" current food amount is " + foodAmount);



    }
    public void setColor(String newColor){

    color=newColor;


    }
    //create a methode that will get the color of the cat and return it
    //name the methode as getColor

    public String getColor(){

    return color;

    }



    /*
    create a methode that will set the color of the cat
    name the method as setColor
    it takes a string Parameter for color
     */

    public static void main(String[] args) {

    Cat leo = new Cat();
    leo.run("west");//null is running west
    leo.name="Gigel";
    leo.foodAmount= 10;
    leo.run("east");//Gigel is running east

    leo.color="blue";
        System.out.println(leo.color);//blue

        leo.setColor("red");
        System.out.println(leo.color);//red


        String colorFromMethod =leo.getColor();

        System.out.println("this is color from getColor method: "+ colorFromMethod);//this is color from getColor method: red

        System.out.println("Calling getColor methode in sout: "+leo.getColor());//Calling getColor methode in sout: red


}

}
