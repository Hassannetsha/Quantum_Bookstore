import java.time.LocalDate;

public class DemoBook extends Book {

    public DemoBook(String ISBN, String title, LocalDate yearPublished, double price,boolean ForSale) {
        super(ISBN, title, yearPublished, price,ForSale);
    }

}
