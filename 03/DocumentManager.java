import java.io.IOException;

/**
 * Singleton class responsible for managing documents.
 * Supports adding documents and displaying all stored documents.
 */
public class DocumentManager {
    /** Array to store documents */
    private Document[] docs = new Document[0];

    /** The current number of stored documents */
    private static int current = 0;

    /** The singleton instance */
    private static DocumentManager instance;

    /** Private constructor to prevent instantiation */
    private DocumentManager() {}

    /**
     * Returns the singleton instance of the DocumentManager.
     *
     * @return the singleton instance
     */
    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    /**
     * Displays all stored documents by calling their display methods.
     *
     * @throws IOException if an I/O error occurs during document display
     */
    public void displayAllDocuments() throws IOException {
        for (int i = 0; i < current; i++) {
            docs[i].display();
        }
    }

    /**
     * Adds a new document to the manager.
     *
     * @param d the document to add
     */
    public void addDocument(Document d) {
        Document[] newDocs = new Document[current + 1];
        for (int i = 0; i < current; i++) {
            newDocs[i] = docs[i];
        }
        newDocs[current] = d;
        docs = newDocs;
        current++;
    }
}
