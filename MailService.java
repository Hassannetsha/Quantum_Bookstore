
public class MailService {
    private String Email;
    Book book;
    public String getEmail() {
        return Email;
    }

    public MailService(Book book,String email) {
        Email = email;
        this.book = book;
    }
    
}
