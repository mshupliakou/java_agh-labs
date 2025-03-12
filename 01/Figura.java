public class Figura {
    // Static variable storing the number of created figures
    protected static int count;

    /**
     * Method to get the total number of created figures.
     * @return the number of all figures
     */
    static int pobierzLiczbeWszystkichFigur() {
        return count;
    }

    /**
     * Overridden toString() method returning a string representation of the object.
     * @return the string "figure"
     */
    @Override
    public String toString() {
        return "figure";
    }
}
