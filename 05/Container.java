import java.util.*;

// Generic class that implements Iterable to store items of type T, where T extends LibraryItem
public class Container<T extends LibraryItem> implements Iterable<T> {

    // List to hold the items of type T (which must implement LibraryItem)
    List<T> container = new ArrayList<T>(0);

    // Method to add an item of type T to the container
    void addItem(T x) {
        container.add(x);
    }

    // Override iterator method to return an iterator for the container
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = container.iterator();
        return it;
    }

    // Method to get all the items in the container
    public List<T> getItems() {
        return container;
    }
}
