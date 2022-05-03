package Arrays;

public class MultiDimentionalPractice3 {
    public static void main(String[] args) {
        /*

         */
        String [][] brands = { {"Apple " , "Dell", "Hp", "Lenovo", "Accer" }, {"Samsung ", "Lg","Sonny"}, {"Alexa ,", "Google", "Siri", "Logitech", "JBL"}};
        double [][] price = {{2500 , 1900,1800 ,1100 , 1600} ,{2100 , 1699 ,1599}, {79.99, 89.99, 99.99,69.45,59.65}};

        System.out.println("the price for " + brands[0][0] + "computer is " + price[0][0]);

        for (int i = 0 ; i<brands.length ; i++){
            for (int j = 0 ; j<brands[i].length ; j++){
                System.out.println("the price for " + brands[i][j] + "computer is " + price[i][j]);
            }
        }


    }
}
