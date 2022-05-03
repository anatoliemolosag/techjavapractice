package OOP.Inheritance;

public class Wild extends Animal {

      String name = "Wild";

      @Override
    public void sleep(){
          System.out.println("Wild is sleeping");
      }
      @Override
      void move(){
          System.out.println("Wild Animal is moving fast");
      }

      private void move(int speed){
          System.out.println("Wild animal is moving private");
      }


}
