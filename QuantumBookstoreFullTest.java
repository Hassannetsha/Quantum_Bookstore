import java.time.LocalDate;

public class QuantumBookstoreFullTest {
    private static Inventory inventory;
    private static Cart cart;

    // Tries to buy a book that has passed the allowed years to be sold
    public void test1() {
        Book book1 = new PaperBook("paper Book", "wild Jungle", LocalDate.of(2023, 7, 3), 100, true, 100);
        Book book2 = new EBook("Ebook", "robotics", LocalDate.of(2021, 7, 7), true, 50, ".pdf"); // Outdated
        Book book3 = new DemoBook("Demo Book", "mechanics", LocalDate.of(2024, 1, 26), 200, false);

        Inventory inventory = Inventory.GetInventory();
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);

        // Check for outdated books (older than 3 years)
        inventory.checkOutDatedBooks();

        // Attempt to checkout an EBook
        Cart cart = new Cart("Ebook", 110, "hassanelkersh.work@gmail.com", "Nasr City", 40);
        cart.checkout();
    }

    // Tries to add a DemoBook to the cart which is not for sale
    public void test2() {
        Book book1 = new PaperBook("paper Book", "wild Jungle", LocalDate.of(2023, 7, 3), 100, true, 100);
        Book book2 = new EBook("Ebook", "robotics", LocalDate.of(2021, 7, 7), true, 50, ".pdf");
        Book book3 = new DemoBook("Demo Book", "mechanics", LocalDate.of(2024, 1, 26), 200, false);

        Inventory inventory = Inventory.GetInventory();
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);

        // Attempt to buy the Demo Book (which is not for sale)
        Cart cart = new Cart("Demo Book", 110, "hassanelkersh.work@gmail.com", "Nasr City", 40);

        // Remove outdated books (optional here)
        inventory.checkOutDatedBooks();

        cart.checkout();

    }

    // Tries to buy a book with quantity more than available in stock
    public void test3() {
        Book book1 = new PaperBook("paper Book", "wild Jungle", LocalDate.of(2023, 7, 3), 100, true, 100);
        Book book2 = new EBook("Ebook", "robotics", LocalDate.of(2021, 7, 7), true, 50, ".pdf");
        Book book3 = new DemoBook("Demo Book", "mechanics", LocalDate.of(2024, 1, 26), 200, false);

        inventory = Inventory.GetInventory();
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);
        cart = new Cart("Paper Book", 110, "hassanelkersh.work@gmail.com", "Nasr City", 40);
        // This line is to check out dated books
        inventory.checkOutDatedBooks();
        cart.checkout();
    }
    // tries to buy a book with insufficient paid amount
    public void test4() {
        Book book1 = new PaperBook("paper Book", "wild Jungle", LocalDate.of(2023, 7, 3), 100, true, 100);
        Book book2 = new EBook("Ebook", "robotics", LocalDate.of(2021, 7, 7), true, 50, ".pdf");
        Book book3 = new DemoBook("Demo Book", "mechanics", LocalDate.of(2024, 1, 26), 200, false);

        inventory = Inventory.GetInventory();
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);
        cart = new Cart("Paper Book", 100, "hassanelkersh.work@gmail.com", "Nasr City", 40);
        // This line is to check out dated books
        inventory.checkOutDatedBooks();
        cart.checkout();
    }
    // tries to buy a book with sufficient paid amount
    public void test5(){
        Book book1 = new PaperBook("paper Book", "wild Jungle", LocalDate.of(2023, 7, 3), 100, true, 100);
        Book book2 = new EBook("Ebook", "robotics", LocalDate.of(2021, 7, 7), true, 50, ".pdf");
        Book book3 = new DemoBook("Demo Book", "mechanics", LocalDate.of(2024, 1, 26), 200, false);

        inventory = Inventory.GetInventory();
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);
        cart = new Cart("Paper Book", 100, "hassanelkersh.work@gmail.com", "Nasr City",10000);
        // This line is to check out dated books
        inventory.checkOutDatedBooks();
        cart.checkout();
    }
}
