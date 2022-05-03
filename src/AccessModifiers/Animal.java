package AccessModifiers;

public class Animal {

    public String namePublic;
    protected String colorProtected;
    private int agePrivate;
    String genderDefault;

    public void sleepPublic(){

        System.out.println("sleep is Public");
    }

    public void sleepProtected(int hours){

        System.out.println("sleep is Protected");
    }
    public void sleepPrivate(int hours){

        System.out.println("sleep is Private "+ hours);
    }
    void sleepDefault(int hours){

        System.out.println("sleep is default");
    }

    public Animal(){

        System.out.println("Public Constructor");
    }
    protected Animal(String color){

        System.out.println("Protected Constructor");
    }
    Animal(String name,String color){

        System.out.println("Default constructor");
    }
    private Animal(String name , String color , String gender ){

        System.out.println("private constructor");
    }
    public static void main(String[] args) {
        Animal cat1 = new Animal(
                "Fluffy","white","F");
    }






}
