package primitives;

public class CompundAssignment {

    public static void main(String[] args) {

        int carNumber = 12;

        // adding 5 more cars to my initial carNumber

        carNumber = carNumber + 5;

        System.out.println(carNumber);//17

        carNumber += 5;//22

        System.out.println(carNumber);

        carNumber /= 2; //>> varNumber =carNUmber / 2 ;

        System.out.println(carNumber);//11

        double fee = (carNumber * 100); //carNumber ;
        System.out.println(fee);

        fee += (carNumber * 51); // fee = fee + (carNumber * )
        //fee *= 1.51;
        System.out.println(fee);

        int number = 21;

        number %= 5; //number = % 5;
        System.out.println(number);

        fee %=carNumber;// fee = fee % carNumber
        System.out.println(fee);

        number *=  (number -=8);
        System.out.println(number);


    }
}
