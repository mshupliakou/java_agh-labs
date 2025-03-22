// Class representing a music album product in the store
public class MusicAlbum extends MusicProduct {
    // The artist or band who created the album
    private String author;

    // The year the album was released
    private int releaseYear;

    // The genre of the album (e.g., Rock, Pop, Jazz)
    private String genre;

    /**
     * Constructor for the MusicAlbum class.
     *
     * @param name        The name of the album.
     * @param basePrice   The base price of the album.
     * @param quantity    The number of albums in stock.
     * @param author      The artist or band who created the album.
     * @param releaseYear The year the album was released.
     * @param genre       The genre of the album (e.g., Rock, Pop, etc.).
     */
    public MusicAlbum(String name, double basePrice, int quantity, String author, int releaseYear, String genre) {
        super(name, basePrice, quantity);
        this.author = author;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    /**
     * Calculates the price of the music album.
     * Newer albums (released in the last 5 years) are 10% more expensive.
     *
     * @return The calculated price of the album.
     */
    @Override
    public double calculatePrice() {
        // If the album was released in the last 5 years, increase the price by 10%
        int currentYear = 2025;
        return (currentYear - releaseYear <= 5) ? basePrice * 1.1 : basePrice;
    }

    /**
     * Returns a string representation of the album, including its name,
     * author, release year, genre, and calculated price.
     *
     * @return A detailed description of the music album.
     */
    @Override
    public String getInfo() {
        // Return the formatted string for the album, including its price
        return "Album: " + name + ", Artist: " + author + ", Year: " + releaseYear +
                ", Genre: " + genre + ", Price: " + String.format("%.2f", calculatePrice()) + " PLN";
    }
}
