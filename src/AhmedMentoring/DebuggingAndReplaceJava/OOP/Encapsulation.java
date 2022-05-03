package AhmedMentoring.DebuggingAndReplaceJava.OOP;

public class Encapsulation {

    /*
    1)What is encapsulation?

    *it's a way to make your data not accessible and manipulable by everyone
    *it's a way of restriction the data from the user or classes
    *Limiting the user , classes to access your data
    *is hiding the data from users or classes
    *it provides control over the data.

    2)How can you access the data from encapsulation?
    To be able to access the data that encapsulated , you can use Getters and Setters

    3) If encapsulation is hiding the data from users / classes and with getters-setters they can still access it?
    Then what is the point of it ?

    Actually you can access the data like you said , but you can make a specific implementation for specific conditions to restrict(limits)
    the users for your data accessibility.if you want me to give a example Sir/Madame, I can say i have a book and has 300 pages .
    I would like to access the specific page of book , but system should limit me to write more than 300 and less than 0 for the book.
    It means the developer is the decider for this restriction.


     */

    private String name = "Ahmet";
    private int age = 30;
    private String gender = "Male";

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
        if (age<20&&age>5) {
            this.age = age;
        }
        System.out.println("not allowed");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
