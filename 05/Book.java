// Implementing LibraryItem interface
public class Book implements LibraryItem {

    // Instance variables for Book class
    String id;      // Unique identifier (ISBN) for the book
    String title;   // Title of the book
    String author;  // Author of the book
    int year;       // Publication year of the book

    // Default constructor
    Book() {
    }

    // Constructor to initialize all fields of the book
    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter method for the book ID
    String getId() {
        return id;
    }

    // Getter method for the book title
    String getTitle() {
        return title;
    }

    // Getter method for the author's name
    String getAuthor() {
        return author;
    }

    // Getter method for the publication year
    int getYear() {
        return year;
    }

    // Override toString method to provide a string representation of the book
    @Override
    public String toString() {
        return "Book{isbn=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + year + "}";
    }
}
