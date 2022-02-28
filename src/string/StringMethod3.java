package string;

public class StringMethod3 {
    public static void main(String[] args) {
        String device = "microphone";

        // equals() ; it will return true of fallse

        System.out.println(device.equals("microphone"));//true
        System.out.println(device.equals("MICROPHONE"));//false
        System.out.println(device.equals("Screen"));//false
        System.out.println(device.equals(""));//false

        //equalsIgnoreCase() ; it will return true or false

        System.out.println(device.equalsIgnoreCase("MICROPHONE"));//true
        System.out.println(device.equalsIgnoreCase("Microphone"));//true
        System.out.println(device.equalsIgnoreCase("micrOphone"));//true
        System.out.println(device.equalsIgnoreCase("Micro phone"));//false


    }
}
