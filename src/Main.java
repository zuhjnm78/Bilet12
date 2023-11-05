import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of(
                "To Kill a Mockingbird by Harper Lee",
                "1984 by George Orwell",
                "The Great Gatsby by F Scott Fitzgerald",
                "Pride and Prejudice by Jane Austen",
                "The Kite Runner by Khaled Hosseini",
                "The Book Thief by Markus Zusak",
                "The Road by Cormac McCarthy"
        ));
        List<List<String>> distributedBooks = BookShelf.distributeBooks(books);
        for (int i = 0; i < distributedBooks.size(); i++) {
            System.out.println("Shelf" +(i+1) + ": " + distributedBooks.get(i));

        }
    }
}
