package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;
public abstract class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title 1", "Category 1", "Director 1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title 2", "Category 2", "Director 2", 90, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Title 3", "Category 1", "Director 3", 110, 17.99f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        store.removeMedia(dvd2);
    }

}
