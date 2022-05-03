package AhmedMentoring.Constructor;

public class employee {

    String companyName="Java";
    String name;
    double budgetOfCompany;
    int ids;


    public void budget(double salary){

        budgetOfCompany-=salary;
        System.out.println("New budget for company is now : "+ budgetOfCompany);

    }
    public void budget(int income){

        companyName+=income;
        System.out.println("New budget for company is now : "+ budgetOfCompany);
    }
    public employee(){
        System.out.println("No args");
    }



    public employee(String name){
        this.name=name;
        System.out.println("one args");
    }

    public employee(String name, double budgetOfCompany, int ids) {
        this.name = name;
        this.budgetOfCompany = budgetOfCompany;
        this.ids = ids;
    }

    //    //TASK:
//
//    create a Employee_CLass
//
//    method : to update company budget(public void budget(), public void budget(int salary)
//
//    instance fields: --> id, name,budgetOfCompany,companyName(can not be changed)
//
//    constructor : --> no args, one args, multiple args
//
//    Create objects and call these constructors
}
