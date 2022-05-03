package OOP.Abstraction.Interfaces.Interface1;

public class Test {
    public static void main(String[] args) {
        Triangle trinagle=new Triangle();
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(trinagle.getArea());
        System.out.println(trinagle.getPerimeter());
        trinagle.base=2;
        trinagle.height=5;
        System.out.println(trinagle.getArea());
        System.out.println(trinagle.getPerimeter());
    }
}