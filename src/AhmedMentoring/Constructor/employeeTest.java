package AhmedMentoring.Constructor;

public class employeeTest {
    public static void main(String[] args) {

        //employee obj = new employee("anatolie",1234);
        //System.out.println(obj.name +" " + obj.ids);

        employee e1 =new employee();
        employee e2 = new employee("Joe");//Joe
        employee e3 = new employee("Joe",39876,11);
        e2.name="Jessi";//Jessi

        System.out.println(e1.budgetOfCompany);
        System.out.println(e2.budgetOfCompany);
        System.out.println(e2.name);
        System.out.println(e3.budgetOfCompany);//39876.0


    }
}
