/**
 * Class representing a circle, extending the Figura class.
 */
public class Kolo extends Figura {
    // Radius of the circle
    private int radius;
    // Static variable storing the number of created circles
    static int count_kolo;

    /**
     * Constructor initializing the circle with a given radius.
     * Increments the count of figures and circles.
     * @param r the radius of the circle
     */
    Kolo(int r) {
      if (r <= 0) {
    throw new IllegalArgumentException("Radius must be positive");
}

        count++;
        count_kolo++;
        radius = r;
    }

    /**
     * Method to get the total number of created circles.
     * @return the number of all circles
     */
    static int pobierzLiczbeKol() {
        return count_kolo;
    }

    /**
     * Method to calculate the perimeter of the circle.
     * @return the perimeter of the circle
     */
    double perimetr() {
        return radius * 2 * Math.PI;
    }

    /**
     * Method to calculate the area of the circle.
     * @return the area of the circle
     */
    double area() {
        return radius * radius * Math.PI;
    }

    /**
     * Overridden toString() method returning a string representation of the circle.
     * @return a formatted string with area and perimeter of the circle
     */
    @Override
    public String toString() {
        return "Kolo: Pole = " + area() + " Obwód = " + perimetr();
    }
}
