package Map;

public class Employee {

    String name;
    String city;
    int age ;
    int id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id =generateId();

    }

    public int generateId(){

        int x = (int )(Math.random()*1000000);
        return x;


    }

    @Override
    public String toString() {
        return "Employee{" +  "name " +name +"City " +city + "age " + age +" id's " + id;
    }

    /*
    ====TASK:===========
-create an employee class with instance variables of name, city, age, id
-create one constructor to intialize instance variables
-create a method to generate random  employee id and use this id for emplyee
-create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids
-create a method to print only employee names from map
     */
}
