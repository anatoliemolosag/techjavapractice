package OOP.Inheritance3;

public class NoteBook extends Book{


    public NoteBook() {
        super(20,"Book",500);

    }

    //@Override --static method can not be overrriden
    public static int getPageCount(){
        return 200;
    }


    public static void main(String[] args) {

        NoteBook noteBook = new NoteBook();

        Book book = new Book (30,"Java",555);
        System.out.println(noteBook.price);
        System.out.println(noteBook.pageCount);//500
        System.out.println("============================");
        NoteBook noteBook1 = new NoteBook();
        System.out.println(noteBook1.price);
        System.out.println(noteBook.price);
        System.out.println(book.price);
        System.out.println("========================");



        int p = noteBook.getPageCount();
        System.out.println(p);//404



        System.out.println(book.pageCount);//555

        int pb = book.getPageCount();
        System.out.println(pb);//404

        System.out.println(Book.getPageCount());//200 because of static method

        System.out.println(getPageCount());//200 because of static method

        //System.out.println(noteBook.getPageCount);

        System.out.println(NoteBook.getPageCount());//200 becouse of static method



    }


}
