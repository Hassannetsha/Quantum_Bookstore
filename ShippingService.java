
public class ShippingService {
    private String Address;
    Book book;
    public ShippingService(Book book,String address) {
        Address = address;
        this.book = book;
    }

    public String getAddress() {
        return Address;
    }

}
