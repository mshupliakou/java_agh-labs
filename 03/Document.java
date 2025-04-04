import java.io.IOException;

/**
 * Interface representing a generic document.
 */
public interface Document {

    /**
     * Displays the contents of the document.
     *
     * @throws IOException if an input/output error occurs during display
     */
    void display() throws IOException;

    /**
     * Returns the contents of the document as a String.
     *
     * @return the document content
     * @throws IOException if an input/output error occurs during reading
     */
    String getContent() throws IOException;
}
