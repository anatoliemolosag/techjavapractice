package homework1;

public class StringPractice {
    public static void main(String[] args) {

        String myself = "Anatolie";///this isstring
        System.out.println(myself);//Anatolie

        int count = myself.indexOf("i");////this is  index
        System.out.println(count);//6

        int count1 = myself.length();// this is count
        System.out.println(count1);//8

        String animal = "Monkey";
        System.out.println(animal.length());//6

        char letter = animal.charAt(1);
        System.out.println(letter);//o

        String text = " jhkdfvlkjdfhglskjdgfhlvkshdrfglkjglkdfjhglksjerhglisrhglkjdfhlgskjhsdklfjghs;ehgpeowhihgekjrlhgkjldfhgkljds" + "jhkdfsbjgvdsjhgfflkjhgsldfglsdfgjghdsl" +
                "jkfgsjsdhgfksagdhfglsdkjahsfsjh";
        System.out.println(text.charAt(text.length()-1));

    }
}
