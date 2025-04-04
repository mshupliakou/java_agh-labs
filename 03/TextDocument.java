/**
 * Represents a text-based document.
 * Inherits from the BaseDocument class.
 */
public class TextDocument extends BaseDocument {

    /**
     * Constructs a new TextDocument with the specified name and contents.
     *
     * @param name the name of the document
     * @param contents the contents of the document
     */
    public TextDocument(String name, String contents) {
        super(name);
        this.contents = contents;
    }
}
