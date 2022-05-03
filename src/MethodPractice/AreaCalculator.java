package MethodPractice;

import java.text.DecimalFormat;

public class AreaCalculator {

    //create a methode that will calculate a area of rectangle
    //the methode will take 2 parameters
    //it will return the area
    //area of rectangle is : length * width
    //use the methods to find the area of reactangle which has : l = 4.5, w = 2.65 and show the result

    //double length= 4.5;
   //double width = 2.65;

    public double areaCalculator(double length,double width){

        double area = length*width;
        System.out.println("Area of rectangle is "+area);
        return area;
    }
       //overload this are methode to find the area of square
    public double areaCalculator(double length){

        return length*length;

    }
        //overload this areaCalculator methode by passing  name of the shape and impliment solution for
        //related shape to find the area(square or rectangle)

    public double areaCalculator(double length ,double width, String shape ){


        areaCalculator(length);
        areaCalculator(length,width);
        //System.out.println("Area of shape "+  shape + length*width);
        System.out.println("Area of shape  " + shape+ areaCalculator(length,width));
        return length*width;
    }


    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        AreaCalculator obj = new AreaCalculator();

        double areaOfReactangle1 = obj.areaCalculator(4.5,2.65);
        //System.out.println(areaOfReactangle1+ decimalFormat.format(areaOfReactangle1));

        obj.areaCalculator(3,3, "square");

    }



}
