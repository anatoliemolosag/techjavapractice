package WrapperClasses.WrapHome;

public class StringToPrimitive {
    public static void main(String[] args) {

        int number =45;

        String str = String.valueOf(number);
        System.out.println(str);//converted in string//45

        String a ="haha";
        String b = a+str;
        System.out.println(b);//converted in String //haha45

        int toPrimitive = Integer.parseInt(str);
        System.out.println(toPrimitive);//converted in primitive //45

        System.out.println("--------------------------------------------------");
        String c = "10";
        String d = "20";

        int convert = Integer.valueOf(c);
        int convert1 = Integer.valueOf(d);

        int sum = convert+convert1;
        System.out.println(sum);//30
        System.out.println("----------------------------------------------------");

        String e = "40";
        Integer object= Integer.valueOf(e);
        System.out.println(object);






    }
}
