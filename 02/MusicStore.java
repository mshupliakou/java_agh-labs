// The MusicStore class handles operations related to products in a music store, including renting and selling instruments.
public class MusicStore {
    // The maximum capacity of products in the store
    private int size;

    // The current number of products in the store
    private int current;

    // Array to hold music products (instruments, albums, etc.)
    MusicProduct[] products;

    /**
     * Constructor to initialize the music store with a specific size.
     *
     * @param size The maximum number of products the store can hold.
     */
    MusicStore(int size) {
        this.current = 0; // No products initially
        this.size = size;
        products = new MusicProduct[size];
    }

    /**
     * Returns an instrument to the store and marks it as available.
     *
     * @param instrument The instrument being returned.
     */
    void returnInstrument(RentableInstrument instrument) {
        instrument.returnInstrument();  // Mark the instrument as available
        System.out.println("Returned: " + instrument.getInfo() + ", Daily rate: "
                + instrument.dailyRate + " zł, Available");
    }

    /**
     * Sells a product from the store. Reduces the quantity by the specified amount.
     *
     * @param index    The index of the product in the products array.
     * @param quantity The quantity to be sold.
     */
    void sellProduct(int index, int quantity) {
        if (quantity <= products[index].getQuantity()) {
            products[index].decreaseQuantity(quantity);  // Decrease stock after sale
            System.out.println("Sold: " + products[index].getInfo());
        } else {
            System.out.println("ERROR! There are not enough products!");
        }
    }

    /**
     * Adds a new product to the store.
     *
     * @param product The product to be added.
     */
    void addProduct(MusicProduct product) {
        if (current < size) {
            products[current] = product;
            current++;  // Increase the count of products
        } else {
            System.out.println("ERROR! Store is full, cannot add more products.");
        }
    }

    /**
     * Displays the details of all the products in the store.
     */
    void displayAllProducts() {
        for (int i = 0; i < current; i++) {
            System.out.println(products[i].getInfo());  // Display information about each product
        }
    }

    /**
     * Rents an instrument from the store for a specified number of days.
     *
     * @param instrument The instrument being rented.
     * @param days       The number of days the instrument is being rented for.
     */
    void rentInstrument(RentableInstrument instrument, int days) {
        if (instrument.getQuantity() > 0) {
            if (instrument.isAvailable()) {
                instrument.rent();  // Mark the instrument as unavailable
                System.out.println("Rented: " + instrument.getInfo() + ", Daily rate: "
                        + instrument.dailyRate + " zł, Unavailable");
                System.out.println("Rental cost for " + days + " days: "
                        + instrument.calculateRentalCost(days) + " zł");
            } else {
                System.out.println("Error: Instrument is not available for rental");
            }
        } else {
            System.out.println("ERROR! There are not enough products!");
        }
    }
}
