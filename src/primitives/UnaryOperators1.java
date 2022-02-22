package primitives;

public class UnaryOperators1 {

    public static void main(String[] args) {


        int flower = 12;
        //increment++ , decrement--
        //pre-increment/decrement
        //post-increment/decrement

        flower++;
        System.out.println(flower);//13

        flower--;
        System.out.println(flower);//12

        System.out.println(flower++);//12
        System.out.println(flower);//13
        System.out.println(flower--);//show13 ---> 13
        System.out.println(2*flower);//24


        //===========================

        //flower12

        ++flower;
        System.out.println(flower);//13

        --flower;
        System.out.println(flower);//12

        System.out.println(++flower);//13
        System.out.println(++flower);//14
        System.out.println(--flower);//13
        System.out.println(flower--);//13shows , 12 in background
        System.out.println(++flower);//13

        //===============================


        int k = flower++;
        System.out.println(k);//13 , background 14

        System.out.println();
        System.out.println();

        int m = k + ++k; //13 + 14
        System.out.println(m);//27

                int a = k, b = m , j = a + b++;
                //j -->41
        System.out.println("j is" +j);//41
        System.out.println("b is " +b);//28

        char letter = 'd';
        System.out.println(letter);//d

        letter++;
        System.out.println(letter);//e
        --letter;
        --letter;
        letter--;
        --letter;
        --letter;
        letter--;
        System.out.println(letter);

        int numberVersiontheCharacter = letter;
        System.out.println(numberVersiontheCharacter);

        char assignNumberToChar = 101;
        System.out.println(++assignNumberToChar);
        System.out.println(++assignNumberToChar);




    }
}
