import java.util.*;

// Comparator class to compare Book objects based on their title
public class TitleComporator implements Comparator<Book> {

    // Override the compare method to define custom comparison logic for titles
    public int compare(Book a, Book b) {
        // Compare the titles of the two Book objects using String's compareTo method
        return a.getTitle().compareTo(b.getTitle());
    }
}
