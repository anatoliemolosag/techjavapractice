package AhmedMentoring.DebuggingAndReplaceJava;

public class StringAndMetodes {
    /*
    Possible interview questions:
    1) Most of the technical question are related with string.

    String :is an object .
    How can you declare it?
    String Str = "ahmet loves java";   ---> String pool  ---> Heap memory
    String Str2 = new String("ahmed loves java");  --->  Heap Memory

    Methods
    1)length() - it counts number of characters.it returns numbers
    2)equals() - compares a value and returns boolean condition
    3)indexOF()  - it gives you the index number of character .returns number
    4)chartAT() - it gives you character of the specific index, returns character
    5)substring() - it is a way to get specific part of the string.returns string
    6)Upper()/lowerTo -- > it makes the characters upper or lower case .returns string
    7)concat() - it's a way to add two or more separate String.Returns a string.
    8)split()-it a way to split (separate) the string from specific spot.IT RETURNS STRING ARRAY****
    9)replace() -  it replace the characters/ string for specific new value.it returns string
    10)contains() - is a way to check the specific character inside of specific String >Returns boolean
    11)equal.Ignore.Case() - is a way to compare the value (two values) without any sensitiveness(UpperCase/
    lowerCase)returns boolean
    12)StartsWith - checks the first character or characters . Returns boolean.
    13) EndsWith - checks last character or characters .  Returns boolean
    14)trim()   - it removes space from begging and end . return string.








     */

    public static void main(String[] args) {
        //creating a string

        String str= "ahmet loves java";
        String str1 = new String("ahmet loves java");
        String str2 = "ahmet loves java";
        String str3 = new String("ahmet loves java");
        System.out.println(str.equals(str1));//true
        System.out.println(str==str1);//false
        System.out.println(str==str2);//true
        System.out.println(str==str3);//false
        System.out.println(str1.equals(str3));//true

        //First of all you have to know the difference between
        //in what condition you use equals and ==
        // whenever you see .equals method (it always compare /check the ** value** of the variable
        //whenever you see "==" it always checks the location of variables (HEAP -STUCK MEMORY);


        String example = "   Ahmet loVeS JaVa and jAvA like you guys";
        System.out.println(example.length());//gives me the length
        String example2 = "   aHmEt LoveS Java and Java Likes you guys";
        boolean result = example2.equals(example);//false
        System.out.println(result);
        boolean result2 = example2.equalsIgnoreCase(example);//false
        System.out.println(example.indexOf("loveS"));//9
        System.out.println(example2.indexOf("loveS"));//-1 (not found because is not the same)
        System.out.println(example.charAt(5));//m
        int number = example2.indexOf("v");
        String str5 = example.substring(0,number);
        System.out.println(str5);//   Ahmet lo

        System.out.println(example.replace('a', '*'));//Ahmet loVeS J*V* *nd jAvA like you guys
        System.out.println(example2.replace("Java",""));//aHmEt LoveS  and  Likes you guys
        System.out.println(example.replaceFirst("a", "&"));//Ahmet loVeS J&Va and jAvA like you guys
        System.out.println(example.startsWith("ahmet"));//false
        System.out.println(example2.endsWith("guys"));//true

        System.out.println(example.trim().startsWith("Ahmet"));//true
        System.out.println(example2.trim().endsWith(" "));//false

        System.out.println(example.contains("guys"));//true

    }

}
