package AhmedMentoring.Constructor;

public class Baby {


    String name;
    String gender;
    double height;
    double weight;
    String eyeColor ;
    int brainCapacity;

    public Baby(){

        System.out.println("one argument constructor");
        System.out.println("I am a junior ");
    }//as a default this constructor is embedded.(integrated)
    //there are 2 difference between constructor and method
    //constructor doesn't have return type
    //constructor must have same name of the class


    public void Baby(){}//methode

    //methode has return type
    //methode might have same name of the class or not
    //SECOND STEP OF KNOWING ABOUT CONSTRUCTOR
    //* You can directly give the value of the variables
    //*you can create an abject and assign it
    //*you can create a methode and initialize it
    //****you can initialize the instance variables with constructor.(THE MOST EFFICIENT)

    public void  setName(String name){

        this.name=name;//you are trying to assign the local variable to itself
    }

    public void setGender(String sex){

        gender=sex;
    }
    public Baby(String gender){
        this.gender =gender;
        System.out.println("I am a senior hello world");
    }


//i want you to create two argument(any variables) ,three argument, all argument constructor by overloading
    //i want you to initialize them


    public Baby(double weight , double height){
        this.height=height;
        this.weight=weight;
        System.out.println("two argument constructor");
    }

    public Baby(String name, String gender , double weight ,double height,String eyeColor, int brainCapacity){
        this.name=name;
        this.gender=gender;
        this.weight=weight;
        this.height=height;
        this.eyeColor=eyeColor;
        this.brainCapacity=brainCapacity;
        System.out.println("6 argument constructor");
    }



}


