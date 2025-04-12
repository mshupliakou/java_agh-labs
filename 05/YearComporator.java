import java.util.*;

// Comparator class to compare Book objects based on their publication year
public class YearComporator implements Comparator<Book> {

    // Override the compare method to define custom comparison logic for publication years
    public int compare(Book a, Book b) {
        // Compare the publication year of two Book objects
        if (a.getYear() < b.getYear()) {
            return -1; // If a's year is earlier, return a negative value
        } else if (a.getYear() > b.getYear()) {
            return 1; // If a's year is later, return a positive value
        } else {
            return 0; // If the years are equal, return 0
        }
    }
}
