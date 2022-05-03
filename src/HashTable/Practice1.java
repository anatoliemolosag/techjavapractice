package HashTable;

public class Practice1 {

    {
        System.out.println("This is instance block");
    }

    static {
        System.out.println("This is STATIC block");
    }

    public static void main(String[] args) {

        Practice1 o1 = new Practice1();
        Practice1 o2 = new Practice1();
        Practice1 o3 = new Practice1();
        Practice1 o4 = new Practice1();


    }

}
