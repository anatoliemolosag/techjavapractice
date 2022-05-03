package AhmedMentoring.DebuggingAndReplaceJava;

public class Human {
    //instance variables --> belongs to the class
    int age =30;
    String name = "Ahmed";
    double height = 6.2;
    String eyeColors ="Brown";
    double amountOFMuscles = 45.5;
    double theWeightOfSkeleton = 53;
    String gender = "Male";


    public void speak(String name){//local variables
        System.out.println(name);
        System.out.println(this.name);//instance variables
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printAge(){
        System.out.println("my age is "+ this.getAge());
    }

    public Human(int age, String name, double height, String eyeColors, double amountOFMuscles, double theWeightOfSkeleton, String gender) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.eyeColors = eyeColors;
        this.amountOFMuscles = amountOFMuscles;
        this.theWeightOfSkeleton = theWeightOfSkeleton;
        this.gender = gender;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector worked");
    }

    public static void main(String[] args) {

        Human male = new Human(30,"ahmet",6.2,"Brown",55,60,"male");
        Human female = new Human(30,"Leila",6.0,"Blue",30,30,"female");
        Human kids = new Human(12,"ahle",1.2,"Green",10,10,"male");
        male.speak("Mehmet");//Mehmet Ahmed
        //male.age=45;
        male.printAge();
        male=kids;
        System.out.println(male.age);
        kids=null;
        female=kids;
        System.out.println(male.age);
        System.gc();





    }

}
