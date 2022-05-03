package StaticPractice;

import java.util.Random;

public class Student {

     static String name;
    static int age;

    public void study(){

        System.out.println("Student studies " +generateHour() + " hours"+ name);


    }
    public void sleep (){

        System.out.println("Student sleeps "+ generateHour() + " hours" +name);
    }
    public int generateHour(){

        Random random = new Random();
        return random.nextInt(10);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Student student1= new Student("Sam",21);
        student1.sleep();
        student1.study();
        student1.sleep();
        student1.study();
        student1.sleep();





    }
}
