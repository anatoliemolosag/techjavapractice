package OOP.Abstraction.Interfaces.Interface1;

public class Rectangle implements Shape{

    int base , height, side1,side2;


   public int getArea(){
        return (base*height/2);
    }
   public int getPerimeter(){
       return (base+side1+side2);
    }

}
