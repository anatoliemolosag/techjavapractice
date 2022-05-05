public class AlphabeticCharacters {

    public static void main(String[] args) {
        //Find out alpha  , digits and other characters separate
        String str = "Aa34j7i9e#7h89%$";
        String alphabetic = "";
        String digits = "";
        String others = "";
        for (int i= 0 ; i<str.length();i++){

            if(Character.isAlphabetic(str.charAt(i))||Character.isUpperCase(str.charAt(i))){
                alphabetic+=str.charAt(i);
            }
            else if (Character.isDigit(str.charAt(i))){
                digits+=str.charAt(i);
            }else if(str!=alphabetic&&str!=digits){
                others+=str.charAt(i);
            }

        }

        System.out.println(alphabetic);
        System.out.println(digits);
        System.out.println(others);




    }

}
