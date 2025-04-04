import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Adapter class that reads a document from a file and adapts it
 * to the Document interface.
 */
public class FileDocumentAdapter implements Document {
    /** Path to the file containing the document */
    private String file;

    /** The name of the document (read from the first line of the file) */
    private String nameFromFile;

    /**
     * Constructs the adapter with the given file path.
     *
     * @param file path to the document file
     * @throws IOException if the file cannot be read
     */
    public FileDocumentAdapter(String file) throws IOException {
        this.file = file;
    }

    /**
     * Reads the document content from the file and returns it as a TextDocument.
     *
     * @param file the path to the file
     * @return a TextDocument object constructed from the file content
     * @throws IOException if an I/O error occurs during reading
     */
    private TextDocument readDocumentFromFile(String file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineCounter = 0;
            while ((line = reader.readLine()) != null) {
                if (lineCounter == 0) {
                    nameFromFile = line;
                } else {
                    contentBuilder.append(line).append("\n");
                }
                lineCounter++;
            }
        } catch (IOException e) {
            System.out.println("I/O error while reading file: " + e.getMessage());
            throw e;
        }

        return new TextDocument(nameFromFile, contentBuilder.toString());
    }

    /**
     * Displays the document read from the file.
     *
     * @throws IOException if an I/O error occurs during display
     */
    public void display() throws IOException {
        readDocumentFromFile(file).display();
    }

    /**
     * Returns the content of the document read from the file.
     *
     * @return the content of the document
     * @throws IOException if an I/O error occurs during reading
     */
    public String getContent() throws IOException {
        return readDocumentFromFile(file).getContent();
    }
}
