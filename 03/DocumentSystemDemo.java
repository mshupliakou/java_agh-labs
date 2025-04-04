import java.io.IOException;

// Program a document manager including the following elements:
//
// Inheritance and Polymorphism:
// Interface Document
// Abstract class BaseDocument
// Subclass TextDocument
//
// Design Patterns:
// Singleton:
// Class DocumentManager with the method getInstance()
//
// Adapter:
// Class FileDocumentAdapter allowing reading documents from a file
// Note: the constructor of FileDocumentAdapter should declare throwing an IOException
//        (check it by temporarily changing the name of the file being read)
//
// Reading files:
// Using java.io.FileReader and java.util.Scanner to parse the file content
//
// Exception handling:
// try-catch mechanism
// Custom handling of IOException
//
// Use the file document.txt to generate the output.

// Main demonstration class
public class DocumentSystemDemo {
    public static void main(String[] args) {
        try {
            // Creating documents
            Document textDoc1 = new TextDocument("Raport dzienny", "Dzisiejsze zadania zostały wykonane.");
            Document textDoc2 = new TextDocument("Raport dzienny", "Dzisiaj zmarnowałem cały dzień.");

            // Adapter to load a document from a file
            Document fileDoc = new FileDocumentAdapter("document.txt");

            // Singleton to manage documents
            DocumentManager manager = DocumentManager.getInstance();
            manager.addDocument(textDoc1);
            manager.addDocument(textDoc2);
            manager.addDocument(fileDoc);

            // Display all documents
            manager.displayAllDocuments();

        } catch (IOException e) {
            // Handling exception related to file reading
            System.err.println("Wystąpił błąd: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

// Document list:
// Document: Raport dzienny
// Content: Dzisiejsze zadania zostały wykonane.
//---
// Document: Raport dzienny
// Content: Dzisiaj zmarnowałem cały dzień.
//---
// Document: Dokument z pliku
// Content: Pierwsza linia treści dokumentu.
// Druga linia treści dokumentu.
//
//---
