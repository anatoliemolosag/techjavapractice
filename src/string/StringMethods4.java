package string;

public class StringMethods4 {
    public static void main(String[] args) {

        String course = "Java";

        //replace();
        course = course.replace('v' , '$');
        System.out.println(course);//Ja$a
        System.out.println(course.replace("a" , "***"));
        course="Java";
        course= course.replace("Java" , "Selenium" );
        System.out.println(course);

        //trim(); it will return string

        String school = "  Academy  ";
        System.out.println(school);
        school = school.trim();

        System.out.println(school);
        school = " Techtorial Academy";
        System.out.println(school);
        school = school.trim();
        System.out.println(school);




    }

}
