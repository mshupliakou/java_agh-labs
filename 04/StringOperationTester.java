/**
 * Utility class for performing various operations on strings
 * to demonstrate String API features.
 */
public class StringOperationTester {

    // Private constructor to prevent instantiation
    private StringOperationTester() {
    }

    /**
     * Performs a set of example operations on the given string.
     *
     * @param s the input string to analyze
     */
    public static void stringOperations(String s) {
        System.out.println("Original text: " + s);
        System.out.println("Text length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // Find index of first 'a'
        int indexOfA = s.indexOf('a');
        if (indexOfA != -1) {
            System.out.println("Index of first 'a': " + indexOfA);
        }

        // Substring from index 5 to 10 (if valid)
        if (s.length() >= 10) {
            String substring = s.substring(5, 10);
            System.out.println("Substring from 5 to 10: " + substring);
        }

        // Check if the string starts with "Przyk"
        if (s.startsWith("Przyk")) {
            System.out.println("Starts with 'Przyk': true");
        } else {
            System.out.println("Starts with 'Przyk': false");
        }

        // Split and print each word on a new line
        String[] words = s.split(" ");
        System.out.println("Split into " + words.length + " words:");
        for (String word : words) {
            System.out.println(" - " + word);
        }
    }
}
