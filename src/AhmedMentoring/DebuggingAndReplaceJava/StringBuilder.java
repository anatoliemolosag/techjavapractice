package AhmedMentoring.DebuggingAndReplaceJava;

public class StringBuilder {

    /*
    1)What is the difference String and StringBuilder?

    Thei are usefull for the project it terms of mutabillity and immutabilitity

    *String is immutable
    *StringBuffer is mutable
    *String hase more methods than String buidel and some methods are different(Append,reverse)

    2)What is the differences between StringBuider and StringBuffer?
    *String Buffer and Hashtable are Synchronized.
    *Maps and String are non-Synchronized

     */

    public static void main(String[] args) {
        String name ="Ahmet";
        String name1 =new String("Ahmet");
        java.lang.StringBuilder name2 =new java.lang.StringBuilder("Ahmet");
        System.out.println(name2.reverse());
        System.out.println(name.equals(name1));//difference memory location so it will give true
        System.out.println(name=name1);//different memory location so it will give me false
        System.out.println(name2.equals(name1));
        System.out.println(name2.equals(name));
        //you cannot the stringBuilder with string (.equals will work as expected like others)

//immutabiloiti is not going to change until you reassign it
        String gender = "Male";
        gender.concat("name is Ahmet");
        System.out.println(gender);//Male
        java.lang.StringBuilder gender1 = new java.lang.StringBuilder();
        gender1.append("name is Ahmet");
        System.out.println(gender1);






    }
}
