import java.util.ArrayList;
import java.util.List; 

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    private List<DigitalVideoDisc> items;
    private int qtyOrdered;

    public Cart() {
        items = new ArrayList<>();
        qtyOrdered = 0;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        //check if the cart is full
        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            items.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        //check if the item exist
        if(items.remove(disc)){
            qtyOrdered--;
            System.out.println("The disc has been removed");
        } else {
            System.out.println("The disc does not exist in the cart");
        }
    }
    public float totalCost(){
        float totalCost = 0;
        for(DigitalVideoDisc disc : items){
            totalCost += disc.getCost();
        }
        return totalCost;
    }
}
