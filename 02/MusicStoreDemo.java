/**
 * Task: Music Store Management System
 * <p>
 * The goal of this task is to implement a system for managing the assortment
 * of a music store using inheritance, polymorphism,
 * abstract classes, and interfaces.
 */
//Hints:
//The following algorithms are used:
//Instrument rental cost:
//public double calculateRentalCost(int numberOfDays) {
//    // Discount for longer rental period
//    if (numberOfDays > 30) {
//        return numberOfDays * dailyRate * 0.8; // 20% discount
//    } else if (numberOfDays > 7) {
//        return numberOfDays * dailyRate * 0.9; // 10% discount
//    }
//    return numberOfDays * dailyRate;
//}
//
//Album pricing:
//public double calculatePrice() {
//    // Newer albums (last 5 years) are 10% more expensive
//    int currentYear = 2025;
//    return (currentYear - releaseYear <= 5) ? basePrice * 1.1 : basePrice;
//}

//Accessory pricing:
//public double calculatePrice() {
//    // Professional accessories are 25% more expensive
//    return isProfessional ? basePrice * 1.25 : basePrice;
//}

//Instrument pricing:
//public double calculatePrice() {
//    // Acoustic instruments are 15% more expensive
//    return isAcoustic ? basePrice * 1.15 : basePrice;
//}

//Correct output is placed at the bottom of the class.

// Class demonstrating the use of the system
public class MusicStoreDemo {
    public static void main(String[] args) {
        // Creating the store
        MusicStore store = new MusicStore(10);

        // Adding products
        store.addProduct(new Instrument("Classical Guitar", 1200.0, 5,
                "Guitar", "Yamaha", true));

        store.addProduct(new Instrument("Electric Piano", 3500.0, 2,
                "Piano", "Roland", false));

        store.addProduct(new MusicAlbum("The Dark Side of the Moon", 59.99, 15,
                "Pink Floyd", 1973, "Rock"));

        store.addProduct(new MusicAlbum("Future Nostalgia", 49.99, 10,
                "Dua Lipa", 2020, "Pop"));

        store.addProduct(new Accessory("Electric Guitar Strings", 45.0, 20,
                "Strings", false));

        RentableInstrument electricGuitar = new RentableInstrument(
                "Electric Guitar", 2500.0, 3, "Guitar", "Fender", false, 50.0);
        store.addProduct(electricGuitar);

        // Display all products
        System.out.println("Music store assortment:");
        store.displayAllProducts();

        // Selling a product
        System.out.println("\nProduct sale:");
        store.sellProduct(0, 2);

        // Renting an instrument
        System.out.println("\nInstrument rental:");
        store.rentInstrument(electricGuitar, 14);

        // Attempting to rent the same instrument again
        System.out.println("\nAttempt to rent again:");
        store.rentInstrument(electricGuitar, 7);

        // Returning the instrument
        System.out.println("\nInstrument return:");
        store.returnInstrument(electricGuitar);

        // Display store inventory after operations
        System.out.println("\nCurrent inventory status:");
        store.displayAllProducts();
    }
}

//Music store assortment:
//Instrument: Classical Guitar, Brand: Yamaha, Type: Guitar, acoustic, Price: 1380.00 zł
//Instrument: Electric Piano, Brand: Roland, Type: Piano, electric, Price: 3500.00 zł
//Album: The Dark Side of the Moon, Artist: Pink Floyd, Year: 1973, Genre: Rock, Price: 59.99 zł
//Album: Future Nostalgia, Artist: Dua Lipa, Year: 2020, Genre: Pop, Price: 54.99 zł
//Accessory: Electric Guitar Strings, Category: Strings, amateur, Price: 45.00 zł
//Instrument: Electric Guitar, Brand: Fender, Type: Guitar, electric, Price: 2500.00 zł, Daily Rate: 50.00 zł, Available
//
//Product sale:
//Sold: Instrument: Classical Guitar, Brand: Yamaha, Type: Guitar, acoustic, Price: 1380.00 zł
//
//Instrument rental:
//Rented: Instrument: Electric Guitar, Brand: Fender, Type: Guitar, electric, Price: 2500.00 zł, Daily Rate: 50.00 zł, Unavailable
//Rental cost for 14 days: 630.0 zł
//
//Attempt to rent again:
//Error: Instrument is not available for rental
//
//Instrument return:
//Returned: Instrument: Electric Guitar, Brand: Fender, Type: Guitar, electric, Price: 2500.00 zł, Daily Rate: 50.00 zł, Available
//
//Current inventory status:
//Instrument: Classical Guitar, Brand: Yamaha, Type: Guitar, acoustic, Price: 1380.00 zł
//Instrument: Electric Piano, Brand: Roland, Type: Piano, electric, Price: 3500.00 zł
//Album: The Dark Side of the Moon, Artist: Pink Floyd, Year: 1973, Genre: Rock, Price: 59.99 zł
//Album: Future Nostalgia, Artist: Dua Lipa, Year: 2020, Genre: Pop, Price: 54.99 zł
//Accessory: Electric Guitar Strings, Category: Strings, amateur, Price: 45.00 zł
//Instrument: Electric Guitar, Brand: Fender, Type: Guitar, electric, Price: 2500.00 zł, Daily Rate: 50.00 zł, Available
