import java.time.LocalDate;

public class PaperBook extends Book implements CanBeAddedToCart{
    private int AvailableQuantity;

    public PaperBook(String ISBN, String title, LocalDate yearPublished, double price, boolean ForSale, int stock) {
        super(ISBN, title, yearPublished, price, ForSale);
        this.AvailableQuantity = stock;

    }

    @Override
    public boolean canBeAddedToCart(int Quantity) {
        if(AvailableQuantity>=Quantity){
            AvailableQuantity-= Quantity;
            System.out.println("Number of books left = " + this.AvailableQuantity);
            return true;
        }
        return false;
    }
    public int getAvailableQuantity() {
        return AvailableQuantity;
    }
}
