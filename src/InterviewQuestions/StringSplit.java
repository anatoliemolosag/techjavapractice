package InterviewQuestions;

public class StringSplit {
    public static void main(String[] args) {
         /*
         What is the return type of split() method?
NOTE: Return type of split method is String array. We can use for loop or foreach loop to print the values from the array.

         */

        String str = "Darmanova Burulai Sabyrovna";
        String[] splitWords = str.split(" "); // will split string with the spaces

//        System.out.println(splitWords.length);
//
//
//        for (String string :splitWords){
//            System.out.println(string);
//        }



        String n = "";

        for (int i=0; i<splitWords.length; i++){
            n=splitWords[i];
            System.out.println(n);
        }
    }
}
