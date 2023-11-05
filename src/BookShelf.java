import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    public static List<List<String>> distributeBooks(List<String> books) {
        Collections.sort(books);
        int numberOfShelves = 5;
        List<List<String>> shelves = new ArrayList<>();
        for (int i = 0; i < numberOfShelves; i++) {
            shelves.add(new ArrayList<>());

        }
        int currentShelf = 0;
        for(String book : books){
            shelves.get(currentShelf).add(book);
            currentShelf = (currentShelf +1) % 5;
        }
        return shelves;
    }
}
