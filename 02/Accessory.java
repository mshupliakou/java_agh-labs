// Class representing an accessory product in the music store
public class Accessory extends MusicProduct {
    // The type/category of the accessory (e.g., strings, tuners, etc.)
    private String type;

    // A flag indicating if the accessory is professional (more expensive)
    private boolean isProfessional;

    /**
     * Constructor for the Accessory class.
     *
     * @param name           The name of the accessory.
     * @param basePrice      The base price of the accessory.
     * @param quantity       The quantity of the accessory in stock.
     * @param type           The category/type of the accessory.
     * @param isProfessional Whether the accessory is professional or not.
     */
    public Accessory(String name, double basePrice, int quantity, String type, boolean isProfessional) {
        super(name, basePrice, quantity);
        this.type = type;
        this.isProfessional = isProfessional;
    }

    /**
     * Returns a string representation of the accessory, including its name,
     * type, professional status, and calculated price.
     *
     * @return A detailed description of the accessory.
     */
    @Override
    public String getInfo() {
        // Determine the professional level based on the 'isProfessional' flag
        String level = isProfessional ? "professional" : "amateur";

        // Return the formatted string including the calculated price
        return "Accessory: " + name + ", Category: " + type + ", " + level + ", Price: " + calculatePrice() + " PLN";
    }

    /**
     * Calculates the price of the accessory.
     * If the accessory is professional, its price is increased by 25%.
     *
     * @return The final price of the accessory.
     */
    @Override
    public double calculatePrice() {
        // Professional accessories are 25% more expensive
        return isProfessional ? basePrice * 1.25 : basePrice;
    }
}
