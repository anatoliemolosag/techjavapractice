package OOP.Abstraction.Interfaces.Interface1;

public interface Shape {


   public abstract int getArea();

   int getPerimeter();

   private String get(){
       return "Example private";

   }

   default int count(){
       return 5;

   }


   //you can not create regular methode in interface

//    public void run(){
//        System.out.println("Running");
//    }


}
