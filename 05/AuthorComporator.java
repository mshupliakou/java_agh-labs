import java.util.*;

// Comparator class to compare Book objects based on their author name
public class AuthorComporator implements Comparator<Book> {

    // Override the compare method to define custom comparison logic
    public int compare(Book a, Book b) {
        // Compare the authors of the two Book objects using String's compareTo method
        return a.getAuthor().compareTo(b.getAuthor());
    }

}
