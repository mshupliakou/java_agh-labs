// Sellable interface defines the basic contract for products that can be sold in a store.
public interface Sellable {

    /**
     * Calculates the price of the product.
     * This method is intended to be implemented by classes representing sellable products.
     *
     * @return The price of the product.
     */
    double calculatePrice();

    /**
     * Returns the quantity of the product available in stock.
     *
     * @return The available quantity of the product.
     */
    int getQuantity();

    /**
     * Returns detailed information about the product, typically including its name,
     * price, and other relevant information.
     *
     * @return A string containing the information about the product.
     */
    String getInfo();

    /**
     * Decreases the quantity of the product by the specified amount.
     * This method is typically used when a product is sold.
     *
     * @param amount The number of products to be deducted from the available stock.
     */
    void decreaseQuantity(int amount);
}
