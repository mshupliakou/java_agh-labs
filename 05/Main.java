import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Zaimplementuj schemat klas pokazany na diagramie wykorzystując typy generyczne, tak by uzyskać output
// pokazany poniżej.
//Wkazówka:
//Oto deklaracje mniej oczywistych klas:
//public class Container<T extends LibraryItem> implements Iterable<T>
//public class Book implements LibraryItem
//public class LibraryItemIterator<T extends LibraryItem> implements Iterator<T>

public class Main {
    public static void main(String[] args) {
//        Library library = new Library();
        // Create and add books using generic container
        Container<Book> bookContainer = new Container<>();
        bookContainer.addItem(new Book("978-0132350884", "Clean Code", "Robert C. Martin",1987));
        bookContainer.addItem(new Book("111-4444444444", "Effective Java", "Joshua Bloch",2005));
        bookContainer.addItem(new Book("222-1111111111", "Thinking in Java", "Bruce Eckel",2000));

        System.out.println("Niejawne wykorzystanie iteratora");
        for (Book book : bookContainer) {
            System.out.println(book);
        }

        System.out.println("Jawne wykorzystanie iteratora");
        Iterator<Book> bookIterator = bookContainer.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println(book);
        }

        System.out.println("Sortuj po tytule i wypisz");
        java.util.TreeSet<Book> d;
        d = new java.util.TreeSet<Book>(new TitleComporator());
        for (Book book : bookContainer) {
            d.add(book);

        }
        System.out.println( d );

        System.out.println("Sortuj po roku wydania i wypisz");
        java.util.TreeSet<Book> y;
        y = new java.util.TreeSet<Book>(new YearComporator());
        for (Book book : bookContainer) {
            y.add(book);
        }
        System.out.println( y);

        System.out.println("Sortuj po autorze i wypisz");
                java.util.TreeSet<Book> a;
        a = new java.util.TreeSet<Book>(new YearComporator());
        for (Book book : bookContainer) {
            a.add(book);
        }
        System.out.println( a);
        

        System.out.println("Użyj metody z parametrem wieloznacznym");

        List<? extends LibraryItem> books = bookContainer.getItems();
        List<? extends LibraryItem> items = books;
        LibraryUtils.printItems(items);
    }
}

//Niejawne wykorzystanie iteratora
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Jawne wykorzystanie iteratora
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Sortuj po tytule i wypisz
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Sortuj po roku wydania i wypisz
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Sortuj po autorze i wypisz
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
//Użyj metody z parametrem wieloznacznym
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}