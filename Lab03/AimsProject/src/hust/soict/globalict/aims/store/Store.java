package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.*;
import java.util.List;
import java.util.ArrayList;
public class Store {
    private List<Media> itemsInStore = new ArrayList<>();

    public Store() {
        
    }

    public void addMedia(Media item) {
        itemsInStore.add(item);
        System.out.println(item.getClass().getSimpleName() + " added to the store.");
    }

      public void removeMedia(Media item) {
        if (itemsInStore.remove(item)) {
            System.out.println(item.getClass().getSimpleName() + " removed from the store.");
        } else {
            System.out.println(item.getClass().getSimpleName() + " not found in the store.");
        }
    }
    public Media search(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null; // Media not found
    }
    
    
}


