import java.time.LocalDate;

public class EBook extends Book implements CanBeAddedToCart {
    private String fileType;

    public EBook(String ISBN, String title, LocalDate yearPublished, boolean ForSale, double price, String fileType) {
        super(ISBN, title, yearPublished, price, ForSale);
        this.fileType = fileType;

    }

    @Override
    public boolean canBeAddedToCart(int Quantity) {

        return true;
    }

    public String getFileType() {
        return fileType;
    }

}
