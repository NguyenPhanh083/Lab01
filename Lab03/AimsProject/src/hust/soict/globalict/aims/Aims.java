// package hust.soict.globalict.aims;

// import hust.soict.globalict.aims.cart.Cart;
// import hust.soict.globalict.aims.media.DigitalVideoDisc;
// public class Aims {
//     public static void main(String[] args){
//         //Create a new cart
//         Cart anOrder = new Cart();

//         //Create new dvd objects and add them to the cart
//         DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//         "Animation","Roger Allers", 87,19.95f);
//         anOrder.addDigitalVideoDisc(dvd1);
//         DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
//         "Science Fiction","George Lucas", 87,24.95f);
//         anOrder.addDigitalVideoDisc(dvd2);
//         DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//         "Animation",18.99f);
//         anOrder.addDigitalVideoDisc(dvd3);
//         //remove one item
//         anOrder.removeDigitalVideoDisc(dvd3);
//         //print total cost of the items in the cart
//         System.out.println("Total Cost is: ");
//         System.out.println(anOrder.totalCost());
//     }
//     }
package hust.soict.globalict.aims;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;
public class Aims {
public static Store store = new Store();
public static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    showMenu();
    int choice;
    do {
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (0-3).");
            scanner.nextLine(); // Clear the buffer
            choice = -1;
        }
        switch (choice) {
            case 1:
                storeMenu();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                cartMenu();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 0);
}

public static void showMenu() {
    System.out.println("AIMS: ");
    System.out.println("--------------------------------");
    System.out.println("1. View store");
    System.out.println("2. Update store");
    System.out.println("3. See current cart");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3");
}

public static void storeMenu() {
    System.out.println("Options: ");
    System.out.println("--------------------------------");
    System.out.println("1. See a media's details");
    System.out.println("2. Add a media to cart");
    System.out.println("3. Play a media"); // Playable only for CD/DVD
    System.out.println("4. See current cart");
    System.out.println("0. Back");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3-4");

    int choice;
    do {
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (0-4).");
            scanner.nextLine(); // Clear the buffer
            choice = -1;
        }
        switch (choice) {
            case 1:
                seeMediaDetails();
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                Cart.displayCart();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 0);
}

public static void seeMediaDetails() {
    System.out.println("Enter media title: ");
    String title = scanner.nextLine();
    Media media = cart.search(title);
    if (media != null) {
        System.out.println(media);
        mediaDetailsMenu(media);
    } else {
        System.out.println("Media not found.");
    }
}

public static void mediaDetailsMenu(Media media) {
    int choice;

    do {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (media instanceof Playable) {
            System.out.println("2. Play");
        }
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-" + (media instanceof Playable ? 2 : 1));

        try {
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    // Go back
                    break;
                case 1:
                    addMediaToCart();
                    break;
                case 2:
                    if (media instanceof Playable) {
                    playMedia();
                    } else {
                        System.out.println("Invalid choice. Please enter 0 or 1.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0-" + (media instanceof Playable ? 2 : 1) + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Clear the buffer
            choice = -1; // Reset choice to trigger re-prompting
        }
    } while (choice != 0);
}
public static void playMedia() {
    System.out.println("Enter the title of the media to play: ");
    String title = scanner.nextLine();

    // Search for the media in the store
    Media media = store.search(title);
    if (media != null && media instanceof Playable) {
        // Media found and it is playable
        ((Playable) media).play();
    } else {
        // Media not found or not playable
        System.out.println("Media not found or not playable.");
    }
}
public static Cart cart = new Cart();

public static void cartMenu() {
    System.out.println("CART MENU: ");
    System.out.println("--------------------------------");
    System.out.println("1. Filter media in cart");
    System.out.println("2. Sort media in cart");
    System.out.println("3. Remove a media from cart");
    System.out.println("4. Play a mediat");
    System.out.println("5. Place order");
    System.out.println("0. Back");
    System.out.println("--------------------------------");
    System.out.println("Please choose an option: 0-1-2-3-4-5");

    int choice;
    do {
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (0-5).");
            scanner.nextLine(); // Clear the buffer
            choice = -1;
        }
        switch (choice) {
            case 1:
                filterMediaInCart();
                break;
            case 2:
                sortMediaInCart();
                break;
            case 3:
                removeMediaFromCart();
                break;
            case 4:
                System.out.println("Total cost of cart: " + Cart.totalCost());
                break;
            case 5:
                placeOrder();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 0);
}

public static void addMediaToCart() {
    System.out.println("Enter media title to add to cart: ");
    scanner.nextLine(); // Clear the buffer
    String title = scanner.nextLine();
    Media media = cart.search(title);
    if (media != null) {
        cart.addMedia(media);
    } else {
        System.out.println("Media not found in the store.");
    }
}

public static void removeMediaFromCart() {
    System.out.println("Enter media title to remove from cart: ");
    scanner.nextLine(); // Clear the buffer
    String title = scanner.nextLine();
    Media media = cart.search(title);
    if (media != null) {
        cart.removeMedia(media);
    } else {
        System.out.println("Media not found in the cart.");
    }
}

public static void searchMediaInCart() {
    System.out.println("Enter media title to search in cart: ");
    scanner.nextLine(); // Clear the buffer
    String title = scanner.nextLine();
    cart.searchByTitle(title);
}
public static void placeOrder() {
    System.out.println("An order has been created.");
    cart.clearCart();
}
public static void filterMediaInCart() {
    System.out.println("FILTER MEDIA IN CART: ");
    System.out.println("--------------------------------");
    System.out.println("1. Filter by ID");
    System.out.println("2. Filter by title");
    System.out.println("0. Back");
    System.out.println("--------------------------------");
    System.out.println("Please choose an option: 0-1-2");

    int choice;
    do {
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (0-2).");
            scanner.nextLine(); // Clear the buffer
            choice = -1;
        }
        switch (choice) {
            case 1:
                filterByID();
                break;
            case 2:
                filterByTitle();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 0);
}

private static void filterByID() {
    System.out.println("Enter ID to filter: ");
    int id = scanner.nextInt();
    cart.searchByID(id);
}

private static void filterByTitle() {
    System.out.println("Enter title to filter: ");
    scanner.nextLine(); // Clear the buffer
    String title = scanner.nextLine();
    cart.searchByTitle(title);
}

public static void sortMediaInCart() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Sort by:");
        System.out.println("1. Title");
        System.out.println("2. Cost");
        System.out.print("Choose an option: ");
        
        int option;
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        
        switch (option) {
            case 1:
                Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
                System.out.println("Media in cart sorted by title.");
                break;
            case 2:
                Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
                System.out.println("Media in cart sorted by cost.");
                break;
            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }
    }
}
public static void updateStore() {
    System.out.println("UPDATE STORE:");
    System.out.println("--------------------------------");
    System.out.println("1. Add media to store");
    System.out.println("2. Remove media from store");
    System.out.println("0. Back");
    System.out.println("--------------------------------");
    System.out.println("Please choose an option: 0-1-2");

    int choice;
    do {
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (0-2).");
            scanner.nextLine(); // Clear the buffer
            choice = -1;
        }
        switch (choice) {
            case 1:
                addMediaToStore();
                break;
            case 2:
                removeMediaFromStore();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 0);
}

public static void addMediaToStore() {
    System.out.println("Enter media title to add to store: ");
    scanner.nextLine(); // Clear the buffer
    String title = scanner.nextLine();
    Media media = store.search(title);
    if (media != null) {
        store.addMedia(media);
    } else {
        System.out.println("Media not found in the cart.");
    }
}

public static void removeMediaFromStore() {
    System.out.println("Enter media title to remove from store: ");
    scanner.nextLine(); // Clear the buffer
    String title = scanner.nextLine();
    Media media = store.search(title);
    if (media != null) {
        store.removeMedia(media);
    } else {
        System.out.println("Media not found in the store.");
    }
}

}