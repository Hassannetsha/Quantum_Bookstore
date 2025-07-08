import java.time.LocalDate;

public abstract class Book {

    private String ISBN;
    private String title;
    private LocalDate yearPublished;
    private double price;
    protected boolean ForSale = true;
    public Book(String ISBN, String title, LocalDate yearPublished, double price,boolean ForSale) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.ForSale = ForSale;
    }
    public boolean isForSale() {
        return ForSale;
    }
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }
    
}