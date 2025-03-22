// RentableInstrument class extends the Instrument class and implements the Rentable interface,
// representing a musical instrument that can be rented from a music store.
public class RentableInstrument extends Instrument implements Rentable {
    private double rentalCost; // The cost of renting the instrument for a specified period.
    private boolean isAvailable = true; // Tracks whether the instrument is available for rent.
    protected double dailyRate = 50.0; // The daily rental rate for the instrument.

    /**
     * Constructor for RentableInstrument, initializing the instrument with details such as
     * name, base price, quantity, type, manufacturer, acoustic status, and rental cost.
     *
     * @param name The name of the instrument.
     * @param basePrice The base price of the instrument.
     * @param quantity The available quantity of the instrument.
     * @param type The type of instrument (e.g., guitar, piano).
     * @param manufacturer The manufacturer of the instrument.
     * @param isAcoustic Whether the instrument is acoustic or electric.
     * @param rentalCost The rental cost for the instrument.
     */
    public RentableInstrument(String name, double basePrice, int quantity, String type, String manufacturer, boolean isAcoustic, double rentalCost) {
        super(name, basePrice, quantity, type, manufacturer, isAcoustic);
        this.rentalCost = rentalCost;
    }

    /**
     * Returns a string containing the details of the instrument, including whether it is available for rent.
     *
     * @return A string representation of the instrument's information.
     */
    @Override
    public String getInfo() {
        if (this.isAvailable()) {
            return "Instrument: " + name + ", Manufacturer: " + manufacturer + ", Type: " + type + ", Available, Price: " + basePrice;
        } else {
            return "Instrument: " + name + ", Manufacturer: " + manufacturer + ", Type: " + type + ", Unavailable, Price: " + basePrice;
        }
    }

    /**
     * Checks whether the instrument is available for rent.
     *
     * @return true if the instrument is available, false if it is not.
     */
    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Calculates the rental cost based on the number of days the instrument is rented.
     * The method applies a discount for longer rental periods (e.g., more than 7 or 30 days).
     *
     * @param days The number of days the instrument will be rented for.
     * @return The total rental cost based on the number of days and applicable discounts.
     */
    @Override
    public double calculateRentalCost(int days) {
        // Discount for longer rental periods
        if (days > 30) {
            return days * dailyRate * 0.8; // 20% discount
        } else if (days > 7) {
            return days * dailyRate * 0.9; // 10% discount
        }
        return days * dailyRate; // No discount for rentals of 7 days or less
    }

    /**
     * Marks the instrument as returned, making it available for future rentals.
     */
    @Override
    public void returnInstrument() {
        isAvailable = true;
    }

    /**
     * Marks the instrument as rented, making it unavailable for future rentals.
     */
    @Override
    public void rent() {
        isAvailable = false;
    }
}
