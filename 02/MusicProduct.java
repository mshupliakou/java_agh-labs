// Abstract class representing a generic music product (could be an instrument, album, accessory, etc.)
// This class implements the Sellable interface and is meant to be extended by other product types.
public abstract class MusicProduct implements Sellable {
    // The name of the music product (e.g., album, instrument, accessory)
    protected String name;

    // The base price of the music product
    protected double basePrice;

    // The quantity of the product available in stock
    protected int quantity;

    /**
     * Constructor to initialize a new music product.
     *
     * @param name        The name of the music product.
     * @param basePrice   The base price of the product.
     * @param quantity    The number of items available in stock.
     */
    public MusicProduct(String name, double basePrice, int quantity) {
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    /**
     * Decreases the quantity of the product by the specified amount.
     *
     * @param amount The number of items to reduce from the stock.
     */
    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }

    /**
     * Retrieves the current quantity of the product available in stock.
     *
     * @return The quantity of the product.
     */
    @Override
    public int getQuantity() {
        return quantity;
    }

    /**
     * Abstract method that should be implemented by subclasses to provide product-specific information.
     *
     * @return A string describing the product's details (e.g., name, type, price).
     */
    public abstract String getInfo();

    /**
     * Abstract method that should be implemented by subclasses to calculate the final price of the product.
     * Subclasses may apply additional pricing logic (e.g., discounts or surcharges).
     *
     * @return The final price of the product after any adjustments.
     */
    public abstract double calculatePrice();
}
