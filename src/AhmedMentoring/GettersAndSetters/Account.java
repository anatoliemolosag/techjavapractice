package AhmedMentoring.GettersAndSetters;

public class Account {

    String name;
    int age;


    public static void main(String[] args) {

        Account a = new Account();

        a.setName("toni");
        a.setAge(27);
        System.out.println(a.getName());
        System.out.println(a.getAge());

        a.printDetails();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println(name + " , " + age);
    }


}
