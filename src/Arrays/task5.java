package Arrays;

public class task5 {
    public static void main(String[] args) {
        //print out every element in revers order from given string
        //String[] flowers = { "rose" , "lily" , "sunflower", };
        String[] flowers = { "rose" , "lily" , "sunflower", };



        for(String flower : flowers){
            String reverse ="";
            for( int i = flower.length()-1; i>=0;i--){
                reverse = reverse + flower.charAt(i);
            }
            System.out.println(reverse);
        }
    }
}
