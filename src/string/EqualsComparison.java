package string;

public class EqualsComparison
{
    public static void main(String[] args) {
        String name1 = "David" ;
        String name2 = "David;";

        String name3 = new String("David");
        String name4 = new String("David");

        String name5 = name1;
        String name6 = name3;

        System.out.println(name1 == name2);//true
        System.out.println(name1.equals(name2));//true
        System.out.println(name1 == name3);//false
        System.out.println(name3 == name4);//false
        System.out.println(name4==name6);//false
        System.out.println(name3==name6);//true


        name2 = name6;

        System.out.println(name2==name3);//true


    }
}
