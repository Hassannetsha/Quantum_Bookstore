
public class Cart {
    private Book book;
    private Inventory inventory;
    private String Email;
    private String Address;
    private int Quantity;
    private double paidAmount;
    
    
    public Cart(String ISBN, int Quantity, String Email, String Address,double paidAmount) {
        inventory = Inventory.GetInventory();
        book = inventory.getBookByISBN(ISBN);
        this.Quantity = Quantity;
        this.Email = Email;
        this.Address = Address;
        this.paidAmount = paidAmount;
        if (book == null) {
            System.err.println("This book doesn't exist");
            Utilities.continueSuccessfully = false;
            return;
        }
        if (book instanceof CanBeAddedToCart) {
            if(!((CanBeAddedToCart)book).canBeAddedToCart(Quantity)){
                System.out.println("The paid amount  = " + paidAmount + " has been restored");
                System.err.println("The required Quantity is more than the available in stock");
                Utilities.continueSuccessfully = false;
                return;
            }
            if (paidAmount<book.getPrice()) {
                System.out.println("The paid amount is less than the price of the book");
                Utilities.continueSuccessfully = false;

            }
            else{
                double change = paidAmount - book.getPrice();
                System.out.println("The change  = " + change);
            }
        }
        else{
            System.out.println("The paid amount  = " + paidAmount + " has been restored");
            System.err.println("This book can't be added to cart");
                Utilities.continueSuccessfully = false;

            return;
        }
    }
    public void checkout(){
        if (Utilities.continueSuccessfully) {
            MailService mailService = new MailService(book,Email);
            ShippingService shippingService = new ShippingService(book,Address);
            System.out.println("The book bought successfully");
        }
        else{
            System.out.println("can't check out");
        }
        //here checks out based on the type of the book
    }
    public double getPaidAmount() {
        return paidAmount;
    }
    public int getQuantity() {
        return Quantity;
    }
    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public Book getBook() {
        return book;
    }
}
