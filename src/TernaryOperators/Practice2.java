package TernaryOperators;

public class Practice2 {
    public static void main(String[] args) {

        String school = "Techtorial";

        System.out.println( school.contains("oo") ? school.concat("Academy").equalsIgnoreCase("Techtorial Academy")

                : school.toUpperCase());

        System.out.println( 'B' == 'B' ? "tech".equals("tech") : 111);

        short result =  2.3 > 1 ? (short)(8+3.0f) : 8 * 2;
        System.out.println(result);


    }
}
