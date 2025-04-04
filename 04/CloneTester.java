/**
 * Utility class for testing object cloning behavior.
 */
public class CloneTester {

    // Private constructor to prevent instantiation
    private CloneTester() {
    }

    /**
     * Tests cloning of a given TextEntity object and prints detailed comparison.
     *
     * @param t the TextEntity object to clone
     */
    public static void testCloning(TextEntity t) {
        System.out.println("Original object: " + t);

        Object clone = t.clone();
        System.out.println("Cloned object (" + clone.getClass().getSimpleName() + "): " + clone);

        System.out.println("Are they the same object? " + (clone == t));
        System.out.println("Are the objects equal? " + clone.equals(t));
        System.out.println("HashCode of original: " + t.hashCode());
        System.out.println("HashCode of clone: " + clone.hashCode());
    }
}
