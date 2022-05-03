package Map;

import java.util.HashMap;

public class test {

    public static void main(String[] args) {

        Employee e1 = new Employee("Bob", "Los Angeles", 20);
        Employee e2 = new Employee("Sam", "Denver", 15);
        Employee e3 = new Employee("Alex", "Columbus", 28);
        Employee e4 = new Employee("David", "Huston", 20);

        HashMap<Integer, Employee> emp = new HashMap<>();

        emp.put(e1.id , e1);
        emp.put(e2.id,e2);
        emp.put(e3.id,e3);
        emp.put(e4.id,e4);

        //System.out.println(e1.id);
        printName(emp);



    }

    public static void printName(HashMap<Integer,Employee>map){
        for (Employee employee : map.values()){
            if(employee.age>20) {
                System.out.println(employee.name);
            }
        }
    }
}
