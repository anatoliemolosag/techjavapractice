package primitives;

public class LogicalNegation {
    public static void main(String[] args) {


        boolean isLightOn = true ;

        System.out.println(isLightOn);//true

        System.out.println(!isLightOn);// false--> is applied on the line only

        System.out.println(isLightOn);//true --> original value of 'isLightsOn' variable did not change

        isLightOn = false ;//reassignment --> false
        System.out.println(isLightOn);
    }
}
