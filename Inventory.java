import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books;
    private static Inventory inventory;
    private Inventory() {
        this.books = new ArrayList<>();
    }
    public static Inventory GetInventory(){
        if (inventory==null) {
            inventory = new Inventory();
        }
        return inventory;
    }
    public void checkOutDatedBooks(){
        for (int i = 0; i < books.size(); i++) {
            if (LocalDate.now().isAfter(books.get(i).getYearPublished())) {
                System.out.println("Removed book with title: " + books.get(i).getTitle());
                books.remove(i--);
            }
        }
    }
    public Book getBookByISBN(String ISBN){
        
        for(int i = 0;i<books.size();i++){
            if (books.get(i).getISBN()==ISBN) {
                return books.get(i);
            }
            
        }
        return null;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public List<Book> getBooks() {
        return books;
    }
}
