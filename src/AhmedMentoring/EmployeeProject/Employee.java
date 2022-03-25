package AhmedMentoring.EmployeeProject;

public class Employee {
    //instance variables (these variables belong to the class)
    String name;
    double salary;
    int workHours;
    int hireYear;

    public double tax(){
        if(salary<=1000){
            return 0.0;
        }else{
            return salary*0.03;
        }

    }
    public double bonus(){
        int extraHours=(workHours-40);
            if(extraHours>0){
                return extraHours*30;
            }
                return 0.0;

    }public double increaseSalary(){
        int year = 2015 -hireYear;
        if(year<10){
            return salary * 0.05;
        }else if(year>9&&year<20){
            return salary *0.1;
        }else if(year>19){
            return salary*0.15;
        }else {
            return 0.0;
        }
    }
    public void information(){
        //to be able to use the value from methods you should return it
        System.out.println("Name : " +name);
        System.out.println("Salary : "+ salary);
        System.out.println("WorkHours : " + workHours);
        System.out.println("HireDate : "+ hireYear);
        System.out.println("Tax : " +tax()+"$");
        System.out.println("Bonus : "+ bonus()+"$");
        System.out.println("Increased salary : "+increaseSalary()+"$");
        double totalSalary = salary+bonus()-tax();
        System.out.println("salary with tax and bonus : "+totalSalary);
        System.out.println("Total salary with increase salary : " +(salary+increaseSalary()));
    }

}
