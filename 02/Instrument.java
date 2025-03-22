// Class representing a musical instrument product in the store
public class Instrument extends MusicProduct {
    // Type of the instrument (e.g., Guitar, Violin, etc.)
    protected String type;

    // Manufacturer of the instrument
    protected String manufacturer;

    // Flag indicating if the instrument is acoustic
    protected boolean isAcoustic;

    /**
     * Constructor for the Instrument class.
     *
     * @param name        The name of the instrument.
     * @param basePrice   The base price of the instrument.
     * @param quantity    The number of instruments in stock.
     * @param type        The type/category of the instrument (e.g., Guitar, Piano).
     * @param manufacturer The manufacturer of the instrument.
     * @param isAcoustic  Whether the instrument is acoustic or not.
     */
    public Instrument(String name, double basePrice, int quantity, String type, String manufacturer, boolean isAcoustic) {
        super(name, basePrice, quantity);
        this.type = type;
        this.manufacturer = manufacturer;
        this.isAcoustic = isAcoustic;
    }

    /**
     * Calculates the price of the instrument.
     * Acoustic instruments are 15% more expensive.
     *
     * @return The calculated price of the instrument.
     */
    @Override
    public double calculatePrice() {
        // If the instrument is acoustic, increase the price by 15%
        return isAcoustic ? basePrice * 1.15 : basePrice;
    }

    /**
     * Returns a string representation of the instrument, including its name,
     * manufacturer, type, acoustic status, and calculated price.
     *
     * @return A detailed description of the instrument.
     */
    @Override
    public String getInfo() {
        // Determine if the instrument is acoustic or electric
        String acousticText = isAcoustic ? "acoustic" : "electric";

        // Return the formatted string including the price formatted to two decimal places
        return "Instrument: " + name + ", Manufacturer: " + manufacturer + ", Type: " + type + ", " + acousticText +
                ", Price: " + String.format("%.2f", calculatePrice()) + " zł";
    }
}
