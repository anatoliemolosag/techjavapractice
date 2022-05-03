package StringBuilder;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Java");
        System.out.println(builder);//Java
        builder.append(" and Selenium");
        System.out.println(builder);//Java and Selenium
//==========================================================
        String str = "Test";
        System.out.println(str);//Test
        str.concat( " is a word");
        System.out.println(str);//Test
//==========================================================

        builder.append(str);
        System.out.println(builder);//Java and SeleniumTest
        builder  = builder.append(builder);
        System.out.println(builder);//Java and SeleniumTestJava and SeleniumTest

        String string = (builder.append(builder).toString());
        System.out.println(string);//Java and SeleniumTestJava and SeleniumTestJava and SeleniumTestJava and SeleniumTest

        builder = new StringBuilder("Testing");
        System.out.println(builder);//Testing
        builder.append(true);
        System.out.println(builder);//Testingtrue
        builder.append(3.4);
        System.out.println(builder);//Testingtrue3.4
        builder.append("=== ====").append(77777).append(false).append("a");
        System.out.println(builder);//Testingtrue3.4=====77777false

        //charAt();

        System.out.println(builder.charAt(0));//T
        System.out.println(builder.charAt(builder.length()-1));//e

        //indexOf()

        System.out.println( builder.indexOf("T"));//0

        System.out.println(builder.indexOf(" ",5));//17

        System.out.println(builder.indexOf("false"));//27

        System.out.println(builder.lastIndexOf("false"));//27

        System.out.println(builder.indexOf("a"));//28
        System.out.println(builder.lastIndexOf("a"));//32

        //take substring from this builder which is "falsea";
        System.out.println(builder.substring(builder.lastIndexOf("falsea")));//falsea

        System.out.println(builder.substring(builder.indexOf("falsea")));//falsea
        String substring = builder.substring(builder.indexOf("falsea"));
        System.out.println(substring);//falsea

        StringBuilder b = new StringBuilder(builder.substring(builder.lastIndexOf("f")));
        System.out.println(b);
        System.out.println(builder);//Testingtrue3.4=== ====77777falsea

        //inser();
        builder.insert(4,"Hello");
        System.out.println(builder);//TestHelloingtrue3.4=== ====77777falsea

        int[] numbers = {1,2,3,4,5};
        builder.insert(2, Arrays.toString(numbers));
        System.out.println(builder);//Te[1, 2, 3, 4, 5]stHelloingtrue3.4=== ====77777falsea

        StringBuilder builder2 = new StringBuilder(10);
        builder2.append("today ");

        //builder.replace("Testing", "ing");


    }
}
