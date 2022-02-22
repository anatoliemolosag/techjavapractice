package primitives;

public class HomePractice {
    public static void main(String[] args) {

        short num1 = 3;
        byte num2 = (byte)num1;// explicit casting
        System.out.println(num2);//3

        byte num3 = 4;
        int result = (short)(num2 + num3);//7
        System.out.println(result);//7

        int num4 = num1;
        long num5 = num1;
        long result1 = num1+num1;//6
        System.out.println(result1);//6

        //==================================================================================
        // explicit casting
        long l = 2;
        int i = (int)l;//explicit casting
        float fl = 2.3f;
        byte bt = 3;
        System.out.println(i+fl+l+bt);


        //=======================================================================
        //Compund assignment
        // *=, /= , -= , += , %=
        int number1 = 5;
        number1*=2;//number1 (5) * 2 = 10
        System.out.println(number1);

        //======================================================================

        //Unary operators ++ , --

        //++ , --
        int flower = 12;
        //increment++ , decrement--
        //pre-increment/decrement
        //post-increment/decrement

        flower++;
        System.out.println(flower);//13

        flower--;
        System.out.println(flower);//12

        System.out.println(flower++);//show 12 --> flower = 13
        System.out.println(flower);//13
        System.out.println(flower--);//show13 ---> 12
        System.out.println(2*flower);//24

        ++flower;
        System.out.println(flower);//13
        --flower;
        System.out.println(flower);//12

        System.out.println(++flower);//13

        int k = flower++;
        System.out.println("k is " + k );//13 , background 14
        System.out.println("k is " + k);//13
        System.out.println(flower);// 14

        int m = k + ++k; //13 + 14
        System.out.println(m);//27

        int a = k, b = m , j = a + b++; // a =14 , m = 27, j = 14 + 27
        //j -->41
        System.out.println("j is " + j);//41
        System.out.println("b is " + b);//28

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
        System.out.println(letter);//-

        int numberVersiontheCharacter = letter;
        System.out.println(numberVersiontheCharacter);//95

        char assignNumberToChar = 101;
        System.out.println(++assignNumberToChar);//f
        System.out.println(++assignNumberToChar);//g




        //==============================================================
        //Logical Negation

        boolean isLightOn = true ;

        System.out.println(isLightOn);//true

        System.out.println(!isLightOn);// false--> is applied on the line only

        System.out.println(isLightOn);//true --> original value of 'isLightsOn' variable did not change

        isLightOn = false ;//reassignment --> false
        System.out.println(isLightOn);

        //============================================================
        //Comparison Operators == ,

        int o = 4, p =4;

        boolean r1 = o==p;
        System.out.println(r1);//true
        System.out.println(!r1);//false
        //!=
        boolean r2 = o !=p;
        System.out.println(r2);//false
        //> greater than
        boolean r3 = o >p ;
        System.out.println(r3);//false

        //< less than
        boolean r4 = o <p ;
        System.out.println(r4);//false

        //>=
        boolean r5 = o >=p ;
        System.out.println(r5);//true

        //<=

        boolean r6 = o <=p ;
        System.out.println(r6);//true


        System.out.println(50==50);//true
        System.out.println('c' > 'd');//false
        System.out.println('d' > 'c');//true
        System.out.println(67 != 67);//false
        System.out.println('c' > 'b');//true
        System.out.println(true != false);//true

        // ther is an event for kids
        //requirement child has to be 6 years or more

        int ageChild = 4;
        int requireAge = 6;

        boolean canAttend = ageChild ==requireAge;
        System.out.println(canAttend);//false

        //event if the child is 6 or more

        boolean canAttend2 = ageChild >= requireAge;
        System.out.println(canAttend);//false

        // event for kids if their age is less than 6

        boolean canAttend3 = ageChild < requireAge;
        System.out.println(canAttend3);//true

        //event for kids , only 6 year old cannot attend

        boolean canAttend$4= ageChild != requireAge;
        System.out.println(canAttend$4);//true


        int myDistance =11;

        int limit = 10;

        boolean fee = myDistance <= limit ;

        System.out.println(fee);//false

        //====================================================================================
        //Logical Operators && ---> and , || ---> or


        //passing a course
        // when your average score is 70 or more and you  attendence is 90% or more


        int requireAverageScore = 70;
        int requireAttendence = 90;

        int studentScore = 70;
        int studentAttendence = 100;

        boolean resultOfScore= studentScore >= requireAverageScore;

        boolean resultOfAttendance =studentAttendence >= requireAttendence;

        boolean pass = resultOfAttendance && resultOfScore;

        System.out.println("Can student pass " + pass);//true

        boolean pass1 = studentScore >= requireAverageScore && studentAttendence >= requireAttendence;

        System.out.println(pass1);//true


        /*====Task=====
        you are ataking three exams for your math class , to be able to pass the Math class:
        your average score has to be 60 and class average has to be less than your average .

         */
        int exam1 = 40;
        int examn2= 50;
        int exam3 =85;

        int RequireScore = 60;
        int classaverag = 55;
        int yourAverage = (exam1 + examn2 + exam3)/3;

        boolean res = (exam1+examn2+exam3)/3>=RequireScore && classaverag < (exam1+examn2+exam3)/3;
        System.out.println("can i pass math class " + res);//false
        System.out.println(yourAverage);//58


        /* you want to buy a new laptop it's cost is 1200$
        you can pay it as cash or credit
        if you have enought cash or enought credit limit in your credit card ,
        you can take the laptop home
         */

        int laptopcost = 1200;
        int cash = 0;
        int cclimit = 1100;

        boolean get = laptopcost<=cash || laptopcost<=cclimit || cash + cclimit >= laptopcost;
        System.out.println(get);//false











    }
}
