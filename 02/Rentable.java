// The Rentable interface defines the methods for any object that can be rented, such as musical instruments.
public interface Rentable {

    /**
     * Checks if the item is available for rent.
     *
     * @return true if the item is available for rent, false otherwise.
     */
    boolean isAvailable();

    /**
     * Calculates the rental cost based on the number of days the item is rented.
     *
     * @param days The number of days the item is being rented for.
     * @return The rental cost in the local currency (e.g., PLN).
     */
    double calculateRentalCost(int days);

    /**
     * Marks the item as returned and available for future rentals.
     */
    void returnInstrument();

    /**
     * Marks the item as rented and unavailable for other customers.
     */
    void rent();
}
