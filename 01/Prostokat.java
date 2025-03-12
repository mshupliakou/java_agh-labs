/**
 * Class representing a rectangle, extending the Figura class.
 */
public class Prostokat extends Figura {
    // Length and width of the rectangle
    private int length;
    private int width;
    // Static variable storing the number of created rectangles
    private static int count_prostokat;

    /**
     * Constructor initializing the rectangle with given dimensions.
     * Increments the count of figures and rectangles.
     * @param l the length of the rectangle
     * @param w the width of the rectangle
     */
    Prostokat(int l, int w) {
        if (l <= 0 || w <= 0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        count++;
        count_prostokat++;
        length = l;
        width = w;
    }

    /**
     * Method to calculate the perimeter of the rectangle.
     * @return the perimeter of the rectangle
     */
    double perimetr() {
        return 2 * (length + width);
    }

    /**
     * Method to calculate the area of the rectangle.
     * @return the area of the rectangle
     */
    double area() {
        return width * length;
    }

    /**
     * Method to get the total number of created rectangles.
     * @return the number of all rectangles
     */
    static int pobierzLiczbeProstokatow() {
        return count_prostokat;
    }

    /**
     * Overridden toString() method returning a string representation of the rectangle.
     * @return a formatted string with area and perimeter of the rectangle
     */
    @Override
    public String toString() {
        return "Prostokąt: Pole = " + area() + " Obwód = " + perimetr();
    }
}