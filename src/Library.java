import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<Integer, Book> books = new HashMap<>();
    public void addBook(Book book) {
        int id = books.size();
        books.put(id, book);
    }

    public void removeBook(int id) {
        books.remove(id);
    }

    public int size() {
        return books.size();
    }

    // prints:
    // [id]: [title] for each book
    // e.g.
    // 32904: The Communist Manifesto
    public String toString() {
        String s = "";
        for (Map.Entry<Integer, Book> book : books.entrySet()) {
            s += book.getKey();
            s += ": ";
            s += book.getValue().getTitle();
            s += "\n";

        }
    return s;
    }

}
