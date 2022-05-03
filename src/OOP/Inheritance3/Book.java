package OOP.Inheritance3;

public class Book {

    static double price ;
    String title;
    int pageCount=403;

    public Book(double price, String title, int pageCount) {
        this.price = price;
        this.title = title;
        this.pageCount = pageCount;
    }
    public static int getPageCount(){
        return 404;
    }
}
