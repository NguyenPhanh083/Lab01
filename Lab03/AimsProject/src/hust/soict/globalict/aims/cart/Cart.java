package hust.soict.globalict.aims.cart;
import java.util.ArrayList;


import hust.soict.globalict.aims.media.*; 


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private static ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);


    public Cart() {
    }
    
    public void addMedia(Media item) {
        //check if the cart is full
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED){
            itemsOrdered.add(item);
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeMedia(Media item) {
        //check if the item exist
        if(itemsOrdered.remove(item)){
            System.out.println("The disc has been removed");
        } else {
            System.out.println("The disc does not exist in the cart");
        }
    }
    public static float totalCost(){
        float totalCost = 0;
        for(Media item : itemsOrdered){
            totalCost += item.getCost();
        }
        return totalCost;
    }
    public void printOrderedItems(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        float totalPrice = 0;
        int i=1;
        for(Media item : itemsOrdered){
            System.out.println(i +  ". " + item.getClass().getSimpleName());
            totalPrice += item.getCost();
            i++;
        }  
        System.out.println("Total cost: " + totalPrice);
        System.out.println("***************************************************");
    }
    public void searchByTitle(String title){
        boolean found = false;
        for(Media item:itemsOrdered){
            if (item.isMatch(title)){
                System.out.println(item.getClass().getSimpleName() + " found: " + item.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No item found with title: " + title);
        }
    }

    public void searchByID(int id){
        boolean found = false;
        for(Media item:itemsOrdered){
            if (item.isIntMatch(id)){
                System.out.println(item.getClass().getSimpleName() + " found: " + item.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No item found with title: " + id);
        }
    }
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
    public Media search(String title) {
        for (Media item : itemsOrdered) {
            if (item.isMatch(title)) {
                return item;
            }
        }
        return null;
    }

    public static int getMaxNumbersOrdered() {
        return MAX_NUMBERS_ORDERED;
    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    public void clearCart() {
        itemsOrdered.clear();
        System.out.println("Cart cleared.");
    }
    public static void displayCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("********** Your Cart **********");
            for (Media item : itemsOrdered) {
                System.out.println(item);
            }
            System.out.println("Total cost: " + totalCost());
            System.out.println("********************************");
        }
    }
        

    
}
