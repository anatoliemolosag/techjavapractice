package StringBuilder;

public class Practice2 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Wednesday");

        //delete() , deleteCharAt();

        builder.delete(builder.indexOf("day"),builder.length());
        // builder.delete(6,9);
        System.out.println(builder);//Wednesy
        builder.deleteCharAt(builder.indexOf("e"));
        System.out.println(builder);//Wdnes
        builder.deleteCharAt(builder.lastIndexOf("e"));
        System.out.println(builder);//Wdns
        builder.append("every other week");
        builder.deleteCharAt(builder.indexOf("e",builder.indexOf("w")));
        System.out.println(builder);//Wdnsevery other wek

        //reverse();


        StringBuilder builder1 = new StringBuilder("Interview");

        //reverse the builder1 by using loop

        String reversed = "";
        for (int i = builder1.length()-1 ; i>=0;i--) {

            reversed+=builder1.charAt(i);


        }

        System.out.println(reversed);//weivretnI

        System.out.println("------------------");
        builder1.reverse();
        System.out.println(builder1);//weivretnI


        //toString --> to convert StringBuilder to object
        //you can not directly assign String Builder object to String without converting to string

        String str  = builder1.toString();
        str.concat("LastWeek");
        System.out.println(str);


    }

}
