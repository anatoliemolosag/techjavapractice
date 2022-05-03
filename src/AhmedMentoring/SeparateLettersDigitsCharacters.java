package AhmedMentoring;

public class SeparateLettersDigitsCharacters {
    public static void main(String[] args) {

        String str = "AnatolieMolosag12*";

        String letters = "";
        String digits ="";
        String others="";
        String upperCase ="";
        String lowerCase ="";
        for (int i=0; i<str.length();i++){

            if(Character.isUpperCase(str.charAt(i))){
                upperCase+=str.charAt(i);
            }
            else if(Character.isLowerCase(str.charAt(i))){
                letters+=str.charAt(i);
            }

            else if(Character.isAlphabetic(str.charAt(i))){
                letters+=str.charAt(i);
            }
            else if(Character.isDigit(str.charAt(i))){
                digits+=str.charAt(i);

            }
            else {
                others+=str.charAt(i);
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(upperCase);
        System.out.println(letters);
        System.out.println(others);
    }
}
