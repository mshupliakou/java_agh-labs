/**
 * Class representing a triangle, extending the Figura class.
 */
public class Trojkat extends Figura {
    // Sides of the triangle
    private int a;
    private int b;
    private int c;
    // Static variable storing the number of created triangles
    private static int count_trojkat;

    /**
     * Constructor initializing the triangle with given side lengths.
     * Increments the count of figures and triangles.
     * @param side1 the first side of the triangle
     * @param side2 the second side of the triangle
     * @param side3 the third side of the triangle
     */
    Trojkat(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
            (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        count++;
        count_trojkat++;
        a = side1;
        b = side2;
        c = side3;
    }

    /**
     * Method to calculate the perimeter of the triangle.
     * @return the perimeter of the triangle
     */
    double perimetr() {
        return a + b + c;
    }

    /**
     * Method to calculate the area of the triangle using Heron's formula.
     * @return the area of the triangle
     */
    double area() {
        double s = perimetr() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Method to get the total number of created triangles.
     * @return the number of all triangles
     */
    static int pobierzLiczbeTrojkatow() {
        return count_trojkat;
    }

    /**
     * Overridden toString() method returning a string representation of the triangle.
     * @return a formatted string with area and perimeter of the triangle
     */
    @Override
    public String toString() {
        return "Trójkąt: Pole = " + area() + " Obwód = " + perimetr();
    }
}
