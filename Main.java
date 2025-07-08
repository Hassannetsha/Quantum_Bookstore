import java.time.LocalDate;

public class Main {
    private static Inventory inventory;
    private static Cart cart;
    public static void main(String[] args) {
        Book book1 = new PaperBook("paper Book", "wild Jungle", LocalDate.of(2023, 7, 3), 100, true, 100);
        Book book2 = new EBook("Ebook", "robotics", LocalDate.of(2022, 7, 7), true, 50, ".pdf");
        Book book3 = new DemoBook("Demo Book", "mechanics", LocalDate.of(2024, 1, 26), 200, false);

        inventory = Inventory.GetInventory();
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);
        cart = new Cart("Ebook", 110, "hassanelkersh.work@gmail.com", "Nasr City",40);
        cart.checkout();
    }
}
