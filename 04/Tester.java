/**
 * Task: Comparison and Management System
 *
 * Create a set of classes and static methods within them to demonstrate operations on objects,
 * including cloning, usage of the String class methods, `equals`, `hashCode` methods
 * inherited from the Object class, and reflection.
 *
 * Output:
 *
 * Original object: TextEntity{id=1, language='pl', content='Przykładowy tekst'}
 * Cloned object: TextEntity{id=1, language='pl', content='Przykładowy tekst'}
 * Is it the same object? false
 * Are the objects equal? true
 * Original hashCode: 657230859
 * Cloned hashCode: 657230859
 *
 * --- String API Operations ---
 * Original text: Przykładowy tekst
 * Text length: 17
 * Uppercase: PRZYKŁADOWY TEKST
 * Lowercase: przykładowy tekst
 * Index of first 'a': 6
 * Substring from 5 to 10: ładow
 * Starts with 'Przyk': true
 * Split into 2 words:
 *  - Przykładowy
 *  - tekst
 *
 * --- Object Comparison ---
 * t1.equals(t2): true
 * t1.equals(t3): false
 * t1.hashCode(): 657230859
 * t2.hashCode(): 657230859
 * t3.hashCode(): 527796934
 * HashSet size: 2
 * HashSet contents: [TextEntity{id=3, language='en', content='Example text'}, TextEntity{id=1, language='pl', content='Przykładowy tekst'}]
 *
 * --- Reflection and instanceof ---
 *
 * Analyzing object: TextEntity{id=1, language='pl', content='Przykładowy tekst'}
 * Class name: TextEntity
 * Superclass: java.lang.Object
 * Is it an interface? false
 * Available methods:
 *  - equals
 *  - toString
 *  - hashCode
 *  - ... and 2 more methods
 * Is it a TextEntity? true
 * Is it a String? false
 * Is it Cloneable? true
 * Is it Comparable? false
 *
 * Analyzing object: This is a plain String
 * Class name: java.lang.String
 * Superclass: java.lang.Object
 * Is it an interface? false
 * Available methods:
 *  - value
 *  - equals
 *  - length
 *  - ... and 148 more methods
 * Is it a TextEntity? false
 * Is it a String? true
 * Is it Cloneable? false
 * Is it Comparable? true
 */

public class Tester {
    public static void main(String[] args) {
        // Create various text objects
        TextEntity text1 = new TextEntity("Przykładowy tekst", "pl", 1);

        CloneTester.testCloning(text1);

        System.out.println("\n--- String API Operations ---");
        StringOperationTester.stringOperations(text1.getContent());

        TextEntity text2 = new TextEntity("Przykładowy tekst", "pl", 2);
        TextEntity text3 = new TextEntity("Example text", "en", 3);

        System.out.println("\n--- Object Comparison ---");
        ObjectComparisonTester.compareObjects(text1, text2, text3);

        System.out.println("\n--- Reflection and instanceof ---");
        ObjectReflectionAnalyser.analyzeObject(text1);
        ObjectReflectionAnalyser.analyzeObject("This is a plain String");
    }
}
