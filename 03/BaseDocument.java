/**
 * An abstract base class that implements the Document interface.
 * Provides common properties and behavior for all document types.
 */
abstract class BaseDocument implements Document {
    /** The name of the document */
    protected String name;

    /** The contents of the document */
    protected String contents;

    /**
     * Constructs a new BaseDocument with the given name.
     *
     * @param name The name of the document
     */
    BaseDocument(String name) {
        this.name = name;
    }

    /**
     * Returns the contents of the document.
     *
     * @return The content as a String
     */
    public String getContent() {
        return contents;
    }

    /**
     * Displays the name and contents of the document.
     */
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Contents: " + contents);
    }
}
