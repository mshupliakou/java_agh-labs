/**
 * Represents a simple text entity with language and identifier metadata.
 * Demonstrates custom implementation of equals, hashCode, toString, and clone methods.
 */
public class TextEntity implements Cloneable {
    private int id;
    private String language;
    private String text;

    /**
     * Constructs a TextEntity with the given content, language, and ID.
     *
     * @param text     the content of the text
     * @param language the language of the text
     * @param id       the identifier of the text entity
     */
    public TextEntity(String text, String language, int id) {
        this.text = text;
        this.language = language;
        this.id = id;
    }

    /**
     * Checks whether this object is equal to another object.
     * Equality is based on text content and language.
     *
     * @param obj the object to compare to
     * @return true if the other object is a TextEntity with the same text and language
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof TextEntity other) {
            return text.equals(other.text) && language.equals(other.language);
        }
        return false;
    }

    /**
     * Generates a hash code for this TextEntity based on text, language, and ID.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(text, language, id);
    }

    /**
     * Returns the text content of this entity.
     *
     * @return the content
     */
    public String getContent() {
        return text;
    }

    /**
     * Returns a string representation of the TextEntity.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "TextEntity{id=" + id + ", language='" + language + "', content='" + text + "'}";
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return a cloned instance of this TextEntity
     */
    @Override
    public Object clone() {
        return new TextEntity(text, language, id);
    }
}
