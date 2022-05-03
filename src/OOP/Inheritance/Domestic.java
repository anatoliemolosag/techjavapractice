package OOP.Inheritance;

public class Domestic extends Animal {

String eyeColor ="blue";

@Override
    public void sleep(){
    System.out.println("Domestic is sleeping");

}


    public void sleep(int hour){
    System.out.println("Domestic is sleeping hours: "+hour);
}

    @Override
    public void eat() {
        System.out.println("Domestic is eating");
    }

    public void eat (int pounds){
        System.out.println("Domestic is eating"+pounds);
    }
   public  Domestic sound (){
       System.out.println("Domestic is making sound");
       return new Cat();
   }

    @Override
    public String toString() {
    return eyeColor;
    }
}
