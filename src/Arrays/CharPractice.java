package Arrays;

public class CharPractice {
    public static void main(String[] args) {
        //create a array to store these elements{'l' , 'K' , '7' , '?', '2', 'a'}
        //-print out only numbers from that array

        char[] arr = {'l' , 'K' , '7' , '?', '2', 'a'};
//        for ( char elements :arr){
//            if (elements >= '0' && elements<='9'){
//                System.out.println(elements);
//            }
//
//        }
//        for ( char elements :arr){
//            if (Character.isDigit(elements)){
//                System.out.println(elements);
//            }
//
//        }
//        for ( char elements :arr){
//            if (Character.isAlphabetic(elements)){
//                System.out.println(elements);
//            }
//
//        }

        //show the '?' from the array
        for ( char elements : arr){
            if(Character.isDigit(elements) && Character.isAlphabetic(elements)){
                System.out.println(elements);

            }
        }




    }
}
