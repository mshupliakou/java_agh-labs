import java.util.List;

// Utility class to handle operations on LibraryItem objects
public class LibraryUtils {

    // Method to print all items in a list that extends LibraryItem
    // The method accepts a list of objects that are of type LibraryItem or its subclasses
    public static void printItems(List<? extends LibraryItem> items) {
        // Loop through each item in the list
        for (int i = 0; i < items.size(); i++) {
            // Print the string representation of each item
            System.out.println(items.get(i).toString());
        }
    }
}
