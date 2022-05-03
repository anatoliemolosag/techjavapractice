package HOMEWORK.Homework5;

public class FtoCelsiusArray {
    public static void main(String[] args) {

        double[] fahrenheits = new double[]{32,21,0,-3,-40,32,80};

        for(int i= 0; i<fahrenheits.length;i++){
            fahrenheits[i] =(fahrenheits[i]-32)*5/9;
            System.out.print(fahrenheits[i]+", ");
        }


        /*
        You have an array of weather conditions with Fahrenheit numbers.
  Print the Celsius value of each array element.
// NOTE: Be careful after every number there has to be comma(,) and space then the next number.
// Please look carefully for example.

  Example:
  Example fahrenheit array -> {22,45,62,50,-40,32,80}
  Expected Output ->
  -5.555555555555555, 7.222222222222222, 16.666666666666668, 10.0, -40.0, 0.0, 26.666666666666668

         */
    }
}
